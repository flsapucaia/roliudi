package com.example.roliudi.data.service.request

import android.util.Log
import com.example.roliudi.data.Constants
import com.example.roliudi.data.response.MovieResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException

class MovieClient(private val movieApi: MovieApi) {

    fun callFetchMovies(): MovieResponse? {
        val call = movieApi.fetchMovies()
        try {
            val response = call.execute()
            if (response.isSuccessful) {
                Log.d("TMDB", "getMovies successful: ${response.body()?.toString()}")
                return response.body()
            } else {
                Log.d("TMDB", "getMovies Response Error: ${response.errorBody()?.toString()}")
            }
        } catch (e: IOException) {
            Log.e("IOException", e.message.toString())
        } catch (e: RuntimeException) {
            Log.e("Runtime Exception", e.message.toString())
        }
        return null
    }

    companion object {

        fun buildMovieApi(): MovieApi =
            Retrofit.Builder()
                .baseUrl(Constants.baseUrlMovie)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MovieApi::class.java)
    }
}