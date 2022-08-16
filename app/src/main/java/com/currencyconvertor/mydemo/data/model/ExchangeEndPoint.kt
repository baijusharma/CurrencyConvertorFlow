package com.currencyconvertor.mydemo.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class ExchangeEndPoint {

    @Json(name = "timestamp")
    var timestamp = 0L

    @Json(name = "rates")
    var exchangeRates: ExchangeRates? = null
}