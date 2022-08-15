package com.currencyconvertor.mydemo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CurrencyApplication: Application() {

    companion object {
        var appContext: CurrencyApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
    }
}