package com.currencyconvertor.mydemo.network

import com.currencyconvertor.mydemo.data.model.ExchangeEndPoint
import com.currencyconvertor.mydemo.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(Constants.GET_LATEST_RATE)
    suspend fun getExchangeRates(@Query("app_id") app_id: String): Response<ExchangeEndPoint>

}