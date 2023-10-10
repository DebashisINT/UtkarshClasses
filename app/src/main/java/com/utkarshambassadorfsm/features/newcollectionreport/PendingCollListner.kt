package com.utkarshambassadorfsm.features.newcollectionreport

import com.utkarshambassadorfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}