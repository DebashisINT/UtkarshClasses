package com.utkarshambassadorfsm.features.location.api

import com.utkarshambassadorfsm.features.location.shopdurationapi.ShopDurationApi
import com.utkarshambassadorfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}