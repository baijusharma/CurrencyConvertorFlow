package com.currencyconvertor.mydemo.di

import android.content.Context
import com.currencyconvertor.mydemo.data.AppPrefs
import com.currencyconvertor.mydemo.data.CurrencyDao
import com.currencyconvertor.mydemo.network.ApiService
import com.currencyconvertor.mydemo.network.repositories.CurrencyExchangeRepository
import com.currencyconvertor.mydemo.network.repositories.ICurrencyExchangeRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ViewModelComponent::class)
object ViewModelModule {

    @Provides
    fun provideApiRepository(@ApplicationContext context: Context, apiService: ApiService, currencyDao: CurrencyDao, appPrefs: AppPrefs) =
        CurrencyExchangeRepository(context, apiService, currencyDao,appPrefs) as ICurrencyExchangeRepo
}