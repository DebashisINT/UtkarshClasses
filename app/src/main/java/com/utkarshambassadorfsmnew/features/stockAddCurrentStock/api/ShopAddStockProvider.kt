package com.utkarshambassadorfsmnew.features.stockAddCurrentStock.api

import com.utkarshambassadorfsmnew.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.utkarshambassadorfsmnew.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}