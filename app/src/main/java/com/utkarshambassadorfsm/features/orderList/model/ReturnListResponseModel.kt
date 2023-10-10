package com.utkarshambassadorfsm.features.orderList.model

import com.utkarshambassadorfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}