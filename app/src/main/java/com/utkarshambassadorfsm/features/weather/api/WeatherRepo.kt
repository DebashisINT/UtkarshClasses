package com.utkarshambassadorfsm.features.weather.api

import com.utkarshambassadorfsm.base.BaseResponse
import com.utkarshambassadorfsm.features.task.api.TaskApi
import com.utkarshambassadorfsm.features.task.model.AddTaskInputModel
import com.utkarshambassadorfsm.features.weather.model.ForeCastAPIResponse
import com.utkarshambassadorfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}