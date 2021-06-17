package com.example.roliudi.data

import com.example.roliudi.data.service.request.MovieClient
import org.koin.dsl.module

val dataModule = module {
    single { MovieClient.buildMovieApi() }

    single { MovieClient(movieApi = get()) }
}