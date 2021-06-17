package com.example.roliudi.domain.repository

import com.example.roliudi.domain.model.Movie

interface IMoviesRepository {
    fun getMovieList() : List<Movie>?
}