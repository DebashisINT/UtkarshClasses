package com.utkarshambassadorfsm.features.viewAllOrder.interf

import com.utkarshambassadorfsm.app.domain.NewOrderGenderEntity
import com.utkarshambassadorfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}