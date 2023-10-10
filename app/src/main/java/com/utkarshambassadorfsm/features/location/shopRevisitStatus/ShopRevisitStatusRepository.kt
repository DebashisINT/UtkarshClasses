package com.utkarshambassadorfsm.features.location.shopRevisitStatus

import com.utkarshambassadorfsm.base.BaseResponse
import com.utkarshambassadorfsm.features.location.model.ShopDurationRequest
import com.utkarshambassadorfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}