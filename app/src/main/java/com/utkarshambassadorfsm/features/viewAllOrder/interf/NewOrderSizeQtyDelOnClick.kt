package com.utkarshambassadorfsm.features.viewAllOrder.interf

import com.utkarshambassadorfsm.app.domain.NewOrderGenderEntity
import com.utkarshambassadorfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}