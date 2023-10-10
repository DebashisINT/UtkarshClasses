package com.utkarshambassadorfsm.features.viewAllOrder.orderOptimized

import com.utkarshambassadorfsm.app.domain.ProductOnlineRateTempEntity
import com.utkarshambassadorfsm.base.BaseResponse
import com.utkarshambassadorfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}