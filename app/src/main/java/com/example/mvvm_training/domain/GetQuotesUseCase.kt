package com.example.mvvm_training.domain

import com.example.mvvm_training.data.QuoteRepository
import com.example.mvvm_training.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()
    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()

}