package com.utkarshambassadorfsm.features.photoReg.adapter

import com.utkarshambassadorfsm.features.photoReg.model.ProsCustom
import com.utkarshambassadorfsm.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}