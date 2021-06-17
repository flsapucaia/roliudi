package com.example.roliudi.data.service.request

import com.example.roliudi.data.Constants
import com.example.roliudi.data.response.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("movie/popular")
    fun fetchMovies(
        @Query("language") language: String = Constants.languageMovie,
        @Query("page") page: Int = 1,
        @Query("api_key") apiKeyMovie: String = Constants.appIdMovie
//        @Query("region") regionMovie: String = "BRA"
    ): Call<MovieResponse>
}