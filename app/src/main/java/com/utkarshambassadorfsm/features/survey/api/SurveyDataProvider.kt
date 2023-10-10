package com.utkarshambassadorfsm.features.survey.api

import com.utkarshambassadorfsm.features.photoReg.api.GetUserListPhotoRegApi
import com.utkarshambassadorfsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}