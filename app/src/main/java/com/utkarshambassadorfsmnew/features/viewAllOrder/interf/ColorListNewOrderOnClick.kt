package com.utkarshambassadorfsmnew.features.viewAllOrder.interf

import com.utkarshambassadorfsmnew.app.domain.NewOrderColorEntity
import com.utkarshambassadorfsmnew.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}