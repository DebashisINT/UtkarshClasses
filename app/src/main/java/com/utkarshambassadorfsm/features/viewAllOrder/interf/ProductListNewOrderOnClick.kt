package com.utkarshambassadorfsm.features.viewAllOrder.interf

import com.utkarshambassadorfsm.app.domain.NewOrderGenderEntity
import com.utkarshambassadorfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}