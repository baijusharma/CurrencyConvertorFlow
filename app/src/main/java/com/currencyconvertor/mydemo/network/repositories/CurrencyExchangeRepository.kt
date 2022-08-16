package com.currencyconvertor.mydemo.network.repositories

import android.content.Context
import com.currencyconvertor.mydemo.R
import com.currencyconvertor.mydemo.data.AppPrefs
import com.currencyconvertor.mydemo.data.CurrencyDao
import com.currencyconvertor.mydemo.data.model.Currency
import com.currencyconvertor.mydemo.data.model.ExchangeEndPoint
import com.currencyconvertor.mydemo.network.ApiService
import com.currencyconvertor.mydemo.network.BaseApiResponse
import com.currencyconvertor.mydemo.network.NetworkResponse
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


@ViewModelScoped
class CurrencyExchangeRepository @Inject constructor(
    private val mContext: Context,
    private val apiService: ApiService,
    private val currencyDao: CurrencyDao,
    private val appPrefs: AppPrefs
) : BaseApiResponse(), ICurrencyExchangeRepo {

    val apiKey = mContext.getString(R.string.api_key)

    override var isFirstLaunch = appPrefs.isFirstLaunch
    override val timestampInSeconds = appPrefs.timestampInSeconds

    override suspend fun getAllCurrencies(): Flow<NetworkResponse<ExchangeEndPoint>> {
        return flow {
            val result = safeApiCall { apiService.getExchangeRates(apiKey) }
            result.data?.let {
                currencyDao.upsertCurrencies(it.exchangeRates!!.currencies)
            }
            emit(result)
        }.flowOn(Dispatchers.IO)
    }

    override fun upsertCurrencies(currencies: List<Currency>) {
        TODO("Not yet implemented")
    }


}