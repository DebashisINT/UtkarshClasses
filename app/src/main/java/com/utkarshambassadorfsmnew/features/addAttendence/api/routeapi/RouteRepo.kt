package com.utkarshambassadorfsmnew.features.addAttendence.api.routeapi

import com.utkarshambassadorfsmnew.app.Pref
import com.utkarshambassadorfsmnew.features.addAttendence.model.AreaListResponse
import com.utkarshambassadorfsmnew.features.addAttendence.model.DistanceResponseModel
import com.utkarshambassadorfsmnew.features.addAttendence.model.LocationListResponseModel
import com.utkarshambassadorfsmnew.features.addAttendence.model.RouteResponseModel
import com.utkarshambassadorfsmnew.features.addAttendence.model.VisitLocationListResponse
import io.reactivex.Observable

/**
 * Created by Saikat on 22-11-2018.
 */
class RouteRepo(val apiService: RouteApi) {
    fun getRouteList(): Observable<RouteResponseModel> {
        return apiService.getRouteList(Pref.session_token!!, Pref.user_id!!)
    }

    fun getLocList(): Observable<LocationListResponseModel> {
        return apiService.getLocationList(Pref.session_token!!, Pref.user_id!!)
    }

    fun getAreaList(): Observable<AreaListResponse> {
        return apiService.getAreaList(Pref.session_token!!, Pref.user_id!!,Pref.profile_city!!)
    }

    fun getVisitLocationList(): Observable<VisitLocationListResponse> {
        return apiService.getVisitLocationList(Pref.session_token!!)
    }

    fun getDistance(from_id: String, to_id: String): Observable<DistanceResponseModel> {
        return apiService.getDistance(Pref.session_token!!, Pref.user_id!!, from_id, to_id)
    }
}