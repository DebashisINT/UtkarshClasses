package com.utkarshambassadorfsmnew.features.performance.api

import com.utkarshambassadorfsmnew.app.NetworkConstant
import com.utkarshambassadorfsmnew.base.BaseResponse
import com.utkarshambassadorfsmnew.features.performance.model.UpdateGpsInputListParamsModel
import com.utkarshambassadorfsmnew.features.performance.model.UpdateGpsInputParamsModel
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by Saikat on 15-11-2018.
 */
interface UpdateGpsStatusApi {

    @POST("GPSStatus/Update")
    fun updateGpsStatus(@Body updateGps: UpdateGpsInputParamsModel?): Observable<BaseResponse>

    @POST("GPSStatus/GPSLocationUpdateByLists")
    fun updateGpsStatusWithList(@Body updateGps: UpdateGpsInputListParamsModel?): Observable<BaseResponse>

    /**
     * Companion object to create the UpdateGpsStatusApi
     */
    companion object Factory {
        fun create(): UpdateGpsStatusApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(UpdateGpsStatusApi::class.java)
        }
    }
}