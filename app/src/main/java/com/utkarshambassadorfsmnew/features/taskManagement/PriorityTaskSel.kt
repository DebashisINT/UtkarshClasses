package com.utkarshambassadorfsmnew.features.taskManagement

import com.utkarshambassadorfsmnew.base.BaseResponse


data class PriorityTaskSel(var task_priority_list:ArrayList<TaskPriorityResponse> = ArrayList()): BaseResponse()

data class TaskPriorityResponse (var task_priority_id:String = "",
                                     var task_priority_name:String = "")


