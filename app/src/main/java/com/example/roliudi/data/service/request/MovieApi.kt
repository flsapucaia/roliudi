package com.example.roliudi.data.service.request

import com.example.roliudi.data.Constants
import com.example.roliudi.data.response.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("movie/popular")
    fun fetchMovies(
        @Query("api_key") apiKeyMovie: String = Constants.appIdMovie,
        @Query("language") language: String = Constants.languageMovie,
        @Query("page") page: Int = 1,
        @Query("region") regionMovie: String = "BR"
    ): Call<MovieResponse>
}