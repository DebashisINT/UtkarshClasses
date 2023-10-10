package com.utkarshambassadorfsm.features.weather.api

import com.utkarshambassadorfsm.features.task.api.TaskApi
import com.utkarshambassadorfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}