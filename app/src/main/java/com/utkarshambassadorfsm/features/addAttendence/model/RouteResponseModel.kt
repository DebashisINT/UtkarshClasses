package com.utkarshambassadorfsm.features.addAttendence.model

import com.utkarshambassadorfsm.base.BaseResponse

/**
 * Created by Saikat on 22-11-2018.
 */
class RouteResponseModel : BaseResponse() {
    var route_list: ArrayList<RouteListDataModel>? = null
}