package com.example.mvvm_training.domain

import com.example.mvvm_training.data.QuoteRepository
import com.example.mvvm_training.data.model.QuoteModel
import com.example.mvvm_training.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor (){


    operator fun invoke(): QuoteModel? {
        val quotes = QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null

    }

}