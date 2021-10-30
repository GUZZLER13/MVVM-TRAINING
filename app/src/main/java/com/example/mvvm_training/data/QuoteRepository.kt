package com.example.mvvm_training.data

import com.example.mvvm_training.data.model.QuoteModel
import com.example.mvvm_training.data.model.QuoteProvider
import com.example.mvvm_training.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}