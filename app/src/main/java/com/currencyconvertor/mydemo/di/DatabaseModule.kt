package com.currencyconvertor.mydemo.di

import android.content.Context
import com.currencyconvertor.mydemo.data.CurrencyDao
import com.currencyconvertor.mydemo.data.local.CurrencyDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): CurrencyDatabase {
        return CurrencyDatabase.getInstance(appContext)
    }

    @Provides
    fun provideUserDao(currencyDao: CurrencyDatabase): CurrencyDao {
        return currencyDao.currencyDao()
    }
}