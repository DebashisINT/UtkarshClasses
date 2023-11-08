package com.utkarshambassadorfsmnew.features.viewAllOrder.interf

import com.utkarshambassadorfsmnew.app.domain.NewOrderGenderEntity
import com.utkarshambassadorfsmnew.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}