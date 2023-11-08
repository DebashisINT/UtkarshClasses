package com.utkarshambassadorfsmnew.features.survey.api

import com.utkarshambassadorfsmnew.features.photoReg.api.GetUserListPhotoRegApi
import com.utkarshambassadorfsmnew.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}