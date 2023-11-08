package com.utkarshambassadorfsmnew.features.viewAllOrder.interf

import com.utkarshambassadorfsmnew.app.domain.NewOrderGenderEntity
import com.utkarshambassadorfsmnew.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}