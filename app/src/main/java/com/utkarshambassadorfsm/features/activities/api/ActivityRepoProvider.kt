package com.utkarshambassadorfsm.features.activities.api

import com.utkarshambassadorfsm.features.member.api.TeamApi
import com.utkarshambassadorfsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}