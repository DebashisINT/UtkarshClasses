package com.utkarshambassadorfsm.features.dashboard.presentation.api.dayStartEnd

import com.utkarshambassadorfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.utkarshambassadorfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}