package com.currencyconvertor.mydemo.ui

import androidx.lifecycle.ViewModel
import com.currencyconvertor.mydemo.network.repositories.ICurrencyExchangeRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CurrencyExchangeRateViewModel  @Inject constructor(private val iCurrencyExchangeRepo: ICurrencyExchangeRepo): ViewModel(){

}