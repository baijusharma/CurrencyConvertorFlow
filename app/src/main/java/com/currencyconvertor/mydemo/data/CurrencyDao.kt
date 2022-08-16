package com.currencyconvertor.mydemo.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Transaction
import com.currencyconvertor.mydemo.data.model.Currency

@Dao
interface CurrencyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsertCurrency(currency: Currency)

    @Transaction
    suspend fun upsertCurrencies(currencies: List<Currency>) {
        currencies.forEach { upsertCurrency(it) }
    }

}