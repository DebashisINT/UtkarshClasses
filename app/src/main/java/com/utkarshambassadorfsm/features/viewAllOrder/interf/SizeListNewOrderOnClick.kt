package com.utkarshambassadorfsm.features.viewAllOrder.interf

import com.utkarshambassadorfsm.app.domain.NewOrderProductEntity
import com.utkarshambassadorfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}