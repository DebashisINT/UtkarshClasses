package com.utkarshambassadorfsm.features.login.model.userconfig

import com.utkarshambassadorfsm.base.BaseResponse

/**
 * Created by Saikat on 14-01-2019.
 */
class UserConfigResponseModel : BaseResponse() {
    var getconfigure: ArrayList<UserConfigDataModel>? = null
}