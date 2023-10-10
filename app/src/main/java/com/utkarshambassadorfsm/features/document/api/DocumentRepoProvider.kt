package com.utkarshambassadorfsm.features.document.api

import com.utkarshambassadorfsm.features.dymanicSection.api.DynamicApi
import com.utkarshambassadorfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}