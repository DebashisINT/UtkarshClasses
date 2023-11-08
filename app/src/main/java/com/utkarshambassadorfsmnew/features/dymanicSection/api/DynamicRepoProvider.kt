package com.utkarshambassadorfsmnew.features.dymanicSection.api

import com.utkarshambassadorfsmnew.features.dailyPlan.api.PlanApi
import com.utkarshambassadorfsmnew.features.dailyPlan.api.PlanRepo

/**
 * Created by Saikat on 19-Aug-20.
 */
object DynamicRepoProvider {
    fun dynamicRepoProvider(): DynamicRepo {
        return DynamicRepo(DynamicApi.create())
    }

    fun dynamicRepoProviderMultipart(): DynamicRepo {
        return DynamicRepo(DynamicApi.createImage())
    }
}