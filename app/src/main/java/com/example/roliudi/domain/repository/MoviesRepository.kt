package com.example.roliudi.domain.repository

import com.example.roliudi.data.service.request.MovieClient
import com.example.roliudi.domain.model.Movie

class MoviesRepository(){
    fun getMovieList(): List<Movie>? {
        val response = MovieClient.instance.callFetchMovies()
        return response?.results
    }

}