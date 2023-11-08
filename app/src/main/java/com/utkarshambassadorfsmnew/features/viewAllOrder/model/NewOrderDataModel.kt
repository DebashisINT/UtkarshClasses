package com.utkarshambassadorfsmnew.features.viewAllOrder.model

import com.utkarshambassadorfsmnew.app.domain.NewOrderColorEntity
import com.utkarshambassadorfsmnew.app.domain.NewOrderGenderEntity
import com.utkarshambassadorfsmnew.app.domain.NewOrderProductEntity
import com.utkarshambassadorfsmnew.app.domain.NewOrderSizeEntity
import com.utkarshambassadorfsmnew.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

