package com.utkarshambassadorfsmnew.features.viewPPDDStock.api

import com.utkarshambassadorfsmnew.base.BaseResponse
import com.utkarshambassadorfsmnew.features.viewPPDDStock.model.UpdateStockInputParamsModel
import io.reactivex.Observable

/**
 * Created by Saikat on 05-10-2018.
 */
class UpdateStockRepo(val apiService: UpdateStockApi) {
    fun updateStock(updateStockObj: UpdateStockInputParamsModel): Observable<BaseResponse> {
        return apiService.updateStock(updateStockObj)
    }
}