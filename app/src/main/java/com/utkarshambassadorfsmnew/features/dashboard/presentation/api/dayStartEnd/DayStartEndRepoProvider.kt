package com.utkarshambassadorfsmnew.features.dashboard.presentation.api.dayStartEnd

import com.utkarshambassadorfsmnew.features.stockCompetetorStock.api.AddCompStockApi
import com.utkarshambassadorfsmnew.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}