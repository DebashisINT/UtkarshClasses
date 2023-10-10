package com.utkarshambassadorfsm.features.stockAddCurrentStock.api

import com.utkarshambassadorfsm.base.BaseResponse
import com.utkarshambassadorfsm.features.location.model.ShopRevisitStatusRequest
import com.utkarshambassadorfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.utkarshambassadorfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.utkarshambassadorfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.utkarshambassadorfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}