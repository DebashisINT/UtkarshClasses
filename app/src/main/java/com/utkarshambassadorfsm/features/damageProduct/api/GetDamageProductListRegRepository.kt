package com.utkarshambassadorfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.utkarshambassadorfsm.app.FileUtils
import com.utkarshambassadorfsm.base.BaseResponse
import com.utkarshambassadorfsm.features.NewQuotation.model.*
import com.utkarshambassadorfsm.features.addshop.model.AddShopRequestData
import com.utkarshambassadorfsm.features.addshop.model.AddShopResponse
import com.utkarshambassadorfsm.features.damageProduct.model.DamageProductResponseModel
import com.utkarshambassadorfsm.features.damageProduct.model.delBreakageReq
import com.utkarshambassadorfsm.features.damageProduct.model.viewAllBreakageReq
import com.utkarshambassadorfsm.features.login.model.userconfig.UserConfigResponseModel
import com.utkarshambassadorfsm.features.myjobs.model.WIPImageSubmit
import com.utkarshambassadorfsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}