package com.utkarshambassadorfsmnew.features.lead.api

import com.utkarshambassadorfsmnew.features.NewQuotation.api.GetQuotListRegRepository
import com.utkarshambassadorfsmnew.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}