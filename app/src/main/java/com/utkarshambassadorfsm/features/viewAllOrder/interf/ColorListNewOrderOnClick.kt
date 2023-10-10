package com.utkarshambassadorfsm.features.viewAllOrder.interf

import com.utkarshambassadorfsm.app.domain.NewOrderColorEntity
import com.utkarshambassadorfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}