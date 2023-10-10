package com.utkarshambassadorfsm.features.stockCompetetorStock.api

import com.utkarshambassadorfsm.base.BaseResponse
import com.utkarshambassadorfsm.features.orderList.model.NewOrderListResponseModel
import com.utkarshambassadorfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.utkarshambassadorfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}