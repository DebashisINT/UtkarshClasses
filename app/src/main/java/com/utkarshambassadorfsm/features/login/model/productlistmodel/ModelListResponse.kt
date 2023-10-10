package com.utkarshambassadorfsm.features.login.model.productlistmodel

import com.utkarshambassadorfsm.app.domain.ModelEntity
import com.utkarshambassadorfsm.app.domain.ProductListEntity
import com.utkarshambassadorfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}