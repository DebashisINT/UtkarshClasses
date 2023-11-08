package com.utkarshambassadorfsmnew.features.activities.api

import com.utkarshambassadorfsmnew.features.member.api.TeamApi
import com.utkarshambassadorfsmnew.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}