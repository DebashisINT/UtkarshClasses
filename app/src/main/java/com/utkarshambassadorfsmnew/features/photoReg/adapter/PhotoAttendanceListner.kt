package com.utkarshambassadorfsmnew.features.photoReg.adapter

import com.utkarshambassadorfsmnew.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}