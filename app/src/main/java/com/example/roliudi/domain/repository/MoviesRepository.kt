package com.example.roliudi.domain.repository

import com.example.roliudi.data.service.request.MovieClient
import com.example.roliudi.domain.model.Movie

class MoviesRepository(private val apiClient: MovieClient): IMoviesRepository{
    override fun getMovieList(): List<Movie>? {
        val response = apiClient.callFetchMovies()
        return response?.results
    }

}