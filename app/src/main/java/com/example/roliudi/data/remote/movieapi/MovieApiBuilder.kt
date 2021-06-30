package com.example.roliudi.data.remote.movieapi

import com.example.roliudi.data.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieApiBuilder(private val movieApi: MovieApi) {
    companion object {
        fun build(): MovieApi =
            Retrofit.Builder()
                .baseUrl(Constants.baseUrlMovie)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MovieApi::class.java)
    }
}