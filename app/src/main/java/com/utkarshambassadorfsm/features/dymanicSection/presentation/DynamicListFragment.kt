package com.utkarshambassadorfsm.features.dymanicSection.presentation

import android.content.Context
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.utkarshambassadorfsm.R
import com.utkarshambassadorfsm.app.NetworkConstant
import com.utkarshambassadorfsm.app.domain.TaskEntity
import com.utkarshambassadorfsm.app.types.FragType
import com.utkarshambassadorfsm.app.utils.AppUtils
import com.utkarshambassadorfsm.base.presentation.BaseActivity
import com.utkarshambassadorfsm.base.presentation.BaseFragment
import com.utkarshambassadorfsm.features.dashboard.presentation.DashboardActivity
import com.utkarshambassadorfsm.features.dymanicSection.api.DynamicRepoProvider
import com.utkarshambassadorfsm.features.dymanicSection.model.DynamicListDataModel
import com.utkarshambassadorfsm.features.dymanicSection.model.DynamicListResponseModel
import com.utkarshambassadorfsm.features.task.presentation.EditTaskFragment
import com.utkarshambassadorfsm.widgets.AppCustomTextView

import com.pnikosis.materialishprogress.ProgressWheel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

// Revision History
// 1.0 ExoPlayerActivity AppV 4.0.7 Saheli    02/03/2023 Timber Log Implementation
class DynamicListFragment : BaseFragment() {

    private lateinit var mContext: Context

    private lateinit var rv_all_dynamic_list: RecyclerView
    private lateinit var tv_no_data: AppCustomTextView
    private lateinit var progress_wheel: ProgressWheel
    private lateinit var rl_dynamic_list_main: RelativeLayout
    private lateinit var fab: FloatingActionButton

    private var id = ""

    companion object {
        fun newInstance(id: Any): DynamicListFragment {
            val fragment = DynamicListFragment()

            if (id is String) {
                val bundle = Bundle()
                bundle.putString("id", id)
                fragment.arguments = bundle
            }

            return fragment
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context

        id = arguments?.getString("id").toString()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_dynamic_list, container, false)

        initView(view)
        getDynamicList()

        return view
    }

    private fun initView(view: View) {
        view.apply {
            rv_all_dynamic_list = findViewById(R.id.rv_all_dynamic_list)
            tv_no_data = findViewById(R.id.tv_no_data)
            progress_wheel = findViewById(R.id.progress_wheel)
            rl_dynamic_list_main = findViewById(R.id.rl_dynamic_list_main)
            fab = findViewById(R.id.fab)
        }
        progress_wheel.stopSpinning()
        rv_all_dynamic_list.layoutManager = LinearLayoutManager(mContext)
        rl_dynamic_list_main.setOnClickListener(null)
        fab.setOnClickListener {
            (mContext as DashboardActivity).loadFragment(FragType.AddDynamicFragment, true, id)
        }
    }

    private fun getDynamicList() {
        if (!AppUtils.isOnline(mContext)) {
            (mContext as DashboardActivity).showSnackMessage(getString(R.string.no_internet))
            tv_no_data.visibility = View.VISIBLE
            return
        }

        val repository = DynamicRepoProvider.dynamicRepoProvider()
        progress_wheel.spin()
        BaseActivity.compositeDisposable.add(
                repository.getDynamicListData(id)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io())
                        .subscribe({ result ->

                            progress_wheel.stopSpinning()

                            val response = result as DynamicListResponseModel

//                            XLog.d("DYNAMIC ALL LIST RESPONSE=======> " + response.status)
                            Timber.d("DYNAMIC ALL LIST RESPONSE=======> " + response.status)

                            if (response.status == NetworkConstant.SUCCESS) {
                                if (response.info_list != null && response.info_list!!.size > 0) {
                                    tv_no_data.visibility = View.GONE
                                    initAdapter(response.info_list)

                                } else {
                                    tv_no_data.visibility = View.VISIBLE
                                    (mContext as DashboardActivity).showSnackMessage(response.message!!)
                                }
                            } else {
                                tv_no_data.visibility = View.VISIBLE
                                (mContext as DashboardActivity).showSnackMessage(response.message!!)
                            }

                        }, { error ->
                            BaseActivity.isApiInitiated = false
                            error.printStackTrace()
                            progress_wheel.stopSpinning()
                            tv_no_data.visibility = View.VISIBLE
                            (mContext as DashboardActivity).showSnackMessage(getString(R.string.something_went_wrong))
//                            XLog.d("DYNAMIC ALL LIST ERROR=======> " + error.localizedMessage)
                            Timber.d("DYNAMIC ALL LIST ERROR=======> " + error.localizedMessage)
                        })
        )
    }

    private fun initAdapter(infoList: ArrayList<DynamicListDataModel>?) {
        rv_all_dynamic_list.adapter = DynamicListAdapter(mContext, infoList) {
            (mContext as DashboardActivity).loadFragment(FragType.EditDynamicFragment, true, it)
        }
    }

    fun updateList() {
        getDynamicList()
    }
}