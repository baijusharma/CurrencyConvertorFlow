package com.currencyconvertor.mydemo.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "currency")
data class Currency(@PrimaryKey
                    @ColumnInfo(name = "currencyCode")
                    val currencyCode: String,
                    @ColumnInfo(name = "exchangeRate")
                    val exchangeRate: Double)