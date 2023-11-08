package com.utkarshambassadorfsmnew.features.stockAddCurrentStock.api

import com.utkarshambassadorfsmnew.base.BaseResponse
import com.utkarshambassadorfsmnew.features.location.model.ShopRevisitStatusRequest
import com.utkarshambassadorfsmnew.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.utkarshambassadorfsmnew.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.utkarshambassadorfsmnew.features.stockAddCurrentStock.model.CurrentStockGetData
import com.utkarshambassadorfsmnew.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}