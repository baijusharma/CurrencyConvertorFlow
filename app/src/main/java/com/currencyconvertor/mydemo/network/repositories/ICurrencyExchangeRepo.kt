package com.currencyconvertor.mydemo.network.repositories

import com.currencyconvertor.mydemo.data.model.Currency
import com.currencyconvertor.mydemo.data.model.ExchangeEndPoint
import com.currencyconvertor.mydemo.network.NetworkResponse
import kotlinx.coroutines.flow.Flow


interface ICurrencyExchangeRepo {

    var isFirstLaunch: Boolean
    val timestampInSeconds: Long
    suspend fun getAllCurrencies(): Flow<NetworkResponse<ExchangeEndPoint>>
    fun upsertCurrencies(currencies: List<Currency>)
}