package com.example.mvvm_training.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm_training.data.model.QuoteModel
import com.example.mvvm_training.data.model.QuoteProvider

class QuoteViewModel : ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()
    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}