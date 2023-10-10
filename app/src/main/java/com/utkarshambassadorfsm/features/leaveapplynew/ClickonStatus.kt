package com.utkarshambassadorfsm.features.leaveapplynew

import com.utkarshambassadorfsm.features.addAttendence.model.Leave_list_Response


interface ClickonStatus {
    fun OnApprovedclick(obj: Leave_list_Response)
    fun OnRejectclick(obj: Leave_list_Response)
}