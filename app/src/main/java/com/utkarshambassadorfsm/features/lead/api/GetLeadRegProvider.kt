package com.utkarshambassadorfsm.features.lead.api

import com.utkarshambassadorfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.utkarshambassadorfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}