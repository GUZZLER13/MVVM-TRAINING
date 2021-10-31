package com.example.mvvm_training.cores

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// cete classe ne sert plus car on fait cela avec Dagger Hilt (Voir NetworkModule)
object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://mvvm-training-default-rtdb.europe-west1.firebasedatabase.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}