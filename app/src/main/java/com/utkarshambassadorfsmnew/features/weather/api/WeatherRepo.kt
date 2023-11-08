package com.utkarshambassadorfsmnew.features.weather.api

import com.utkarshambassadorfsmnew.base.BaseResponse
import com.utkarshambassadorfsmnew.features.task.api.TaskApi
import com.utkarshambassadorfsmnew.features.task.model.AddTaskInputModel
import com.utkarshambassadorfsmnew.features.weather.model.ForeCastAPIResponse
import com.utkarshambassadorfsmnew.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}