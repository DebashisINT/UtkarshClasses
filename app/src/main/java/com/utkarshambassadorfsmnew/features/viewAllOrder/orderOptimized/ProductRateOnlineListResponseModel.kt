package com.utkarshambassadorfsmnew.features.viewAllOrder.orderOptimized

import com.utkarshambassadorfsmnew.app.domain.ProductOnlineRateTempEntity
import com.utkarshambassadorfsmnew.base.BaseResponse
import com.utkarshambassadorfsmnew.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}