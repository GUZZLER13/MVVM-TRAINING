package com.example.mvvm_training.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm_training.data.model.QuoteModel
import com.example.mvvm_training.domain.GetQuotesUseCase
import com.example.mvvm_training.domain.GetRandomQuoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor(
    val getQuotesUseCase: GetQuotesUseCase,
    val getRandomQuoteUseCase: GetRandomQuoteUseCase

) : ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()


    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getQuotesUseCase()


            //démarrer avec une citation
//            if (!result.isNullOrEmpty()) {
//                quoteModel.postValue(result[0])
//                isLoading.postValue(false)
//            }
        }
    }

    fun randomQuote() {

        isLoading.postValue(true)
        val result = getRandomQuoteUseCase()
        quoteModel.postValue(result!!)


        isLoading.postValue(false)


    }
}