package com.utkarshambassadorfsmnew.features.document.api

import com.utkarshambassadorfsmnew.features.dymanicSection.api.DynamicApi
import com.utkarshambassadorfsmnew.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}