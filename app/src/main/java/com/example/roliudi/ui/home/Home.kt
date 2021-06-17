package com.example.roliudi.ui.home

import com.example.roliudi.domain.model.Movie

interface Home {
    interface View{
        fun setList(movies: List<Movie>)
        fun makeRequest()
        fun displayFailure(error: Int)
    }

    interface Presenter{
        fun getMovieList()
        fun kill()
    }
}