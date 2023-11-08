package com.utkarshambassadorfsmnew.features.login.model.productlistmodel

import com.utkarshambassadorfsmnew.app.domain.ModelEntity
import com.utkarshambassadorfsmnew.app.domain.ProductListEntity
import com.utkarshambassadorfsmnew.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}