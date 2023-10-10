package com.utkarshambassadorfsm.features.stockAddCurrentStock.api

import com.utkarshambassadorfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.utkarshambassadorfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}