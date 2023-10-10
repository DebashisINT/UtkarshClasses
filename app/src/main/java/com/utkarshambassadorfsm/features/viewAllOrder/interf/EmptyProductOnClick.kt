package com.utkarshambassadorfsm.features.viewAllOrder.interf

import com.utkarshambassadorfsm.features.viewAllOrder.model.ProductOrder

interface EmptyProductOnClick {
    fun emptyProductOnCLick(emptyFound:Boolean)
    fun delProductOnCLick(isDel:Boolean)
}