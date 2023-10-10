package com.utkarshambassadorfsm.features.location.shopRevisitStatus

import com.utkarshambassadorfsm.features.location.shopdurationapi.ShopDurationApi
import com.utkarshambassadorfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}