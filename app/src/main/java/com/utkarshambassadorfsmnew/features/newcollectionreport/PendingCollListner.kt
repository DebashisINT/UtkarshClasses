package com.utkarshambassadorfsmnew.features.newcollectionreport

import com.utkarshambassadorfsmnew.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}