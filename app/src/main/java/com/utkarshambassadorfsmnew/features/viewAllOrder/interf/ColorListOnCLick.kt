package com.utkarshambassadorfsmnew.features.viewAllOrder.interf

import com.utkarshambassadorfsmnew.app.domain.NewOrderGenderEntity
import com.utkarshambassadorfsmnew.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}