package com.utkarshambassadorfsmnew.features.viewAllOrder.interf

import com.utkarshambassadorfsmnew.app.domain.NewOrderProductEntity
import com.utkarshambassadorfsmnew.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}