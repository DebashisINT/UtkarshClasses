package com.utkarshambassadorfsmnew.features.location.api

import com.utkarshambassadorfsmnew.features.location.shopdurationapi.ShopDurationApi
import com.utkarshambassadorfsmnew.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}