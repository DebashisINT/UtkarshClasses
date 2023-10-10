package com.utkarshambassadorfsm.features.photoReg.present

import com.utkarshambassadorfsm.app.domain.ProspectEntity
import com.utkarshambassadorfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}