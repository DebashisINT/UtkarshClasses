package com.utkarshambassadorfsmnew.features.location.shopRevisitStatus

import com.utkarshambassadorfsmnew.features.location.shopdurationapi.ShopDurationApi
import com.utkarshambassadorfsmnew.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}