package com.utkarshambassadorfsm.features.viewAllOrder.model

import com.utkarshambassadorfsm.app.domain.NewOrderColorEntity
import com.utkarshambassadorfsm.app.domain.NewOrderGenderEntity
import com.utkarshambassadorfsm.app.domain.NewOrderProductEntity
import com.utkarshambassadorfsm.app.domain.NewOrderSizeEntity
import com.utkarshambassadorfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

