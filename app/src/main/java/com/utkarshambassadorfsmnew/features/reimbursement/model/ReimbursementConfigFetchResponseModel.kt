package com.utkarshambassadorfsmnew.features.reimbursement.model

import com.utkarshambassadorfsmnew.base.BaseResponse

/**
 * Created by Saikat on 24-01-2019.
 */
class ReimbursementConfigFetchResponseModel : BaseResponse() {
    var maximum_allowance: String? = null
    var distance: String? = null
    var rate: String? = null
}