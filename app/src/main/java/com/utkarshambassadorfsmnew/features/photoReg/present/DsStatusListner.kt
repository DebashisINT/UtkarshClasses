package com.utkarshambassadorfsmnew.features.photoReg.present

import com.utkarshambassadorfsmnew.app.domain.ProspectEntity
import com.utkarshambassadorfsmnew.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}