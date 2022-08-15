package com.currencyconvertor.mydemo.data

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.currencyconvertor.mydemo.data.model.Currency

interface CurrencyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsertCurrency(currency: Currency)
}