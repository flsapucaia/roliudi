package com.example.roliudi

import android.app.Application
import com.example.roliudi.data.response.MovieResponseToMovie
import com.example.roliudi.data.service.request.MovieClient
import com.example.roliudi.domain.repository.IMoviesRepository
import com.example.roliudi.domain.repository.MoviesRepository

class AppCore: Application() {
    override fun onCreate() {
        super.onCreate()

        MovieClient.initialize()
    }

    companion object {

        val movieRepository = MoviesRepository()
    }
}
