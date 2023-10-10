package com.utkarshambassadorfsm.features.location.api

import com.utkarshambassadorfsm.app.Pref
import com.utkarshambassadorfsm.base.BaseResponse
import com.utkarshambassadorfsm.features.location.model.AppInfoInputModel
import com.utkarshambassadorfsm.features.location.model.AppInfoResponseModel
import com.utkarshambassadorfsm.features.location.model.GpsNetInputModel
import com.utkarshambassadorfsm.features.location.model.ShopDurationRequest
import com.utkarshambassadorfsm.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}