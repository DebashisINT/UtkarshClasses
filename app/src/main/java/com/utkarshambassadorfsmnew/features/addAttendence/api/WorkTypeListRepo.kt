package com.utkarshambassadorfsmnew.features.addAttendence.api

import com.utkarshambassadorfsmnew.app.Pref
import com.utkarshambassadorfsmnew.features.addAttendence.model.WorkTypeResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 31-08-2018.
 */
class WorkTypeListRepo(val apiService: WorkTypeListApi) {
    fun getWorkTypeList(): Observable<WorkTypeResponseModel> {
        return apiService.getWorkType(Pref.user_id!!)
    }
}