package com.currencyconvertor.mydemo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.currencyconvertor.mydemo.base.BaseFragment
import com.currencyconvertor.mydemo.databinding.FragmentCurrencyRateBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CurrencyExchangeRateFragment : BaseFragment() {

    private val currencyExchangeRateVM: CurrencyExchangeRateViewModel by viewModels()
    private var _binding: FragmentCurrencyRateBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}