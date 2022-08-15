package com.currencyconvertor.mydemo.utils

import android.content.Context
import android.net.ConnectivityManager
import java.math.BigDecimal
import java.math.RoundingMode

object Utils {

    fun Context.isNetworkAvailable(): Boolean {
        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return (activeNetworkInfo != null && activeNetworkInfo.isConnected)
    }

    fun BigDecimal.roundToFourDecimalPlaces(): BigDecimal = setScale(4, RoundingMode.HALF_DOWN)

   // fun Int.isValid() = this != INVALID.position

    fun Long.toSeconds() = this / 1_000L

    fun Long.toMillis() = this * 1_000L

    val String.Companion.EMPTY get() = ""
}