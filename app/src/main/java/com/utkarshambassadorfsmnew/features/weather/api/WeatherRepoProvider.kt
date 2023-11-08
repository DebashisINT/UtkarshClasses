package com.utkarshambassadorfsmnew.features.weather.api

import com.utkarshambassadorfsmnew.features.task.api.TaskApi
import com.utkarshambassadorfsmnew.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}