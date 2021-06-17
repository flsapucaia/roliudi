package com.example.roliudi.domain

import com.example.roliudi.domain.repository.IMoviesRepository
import com.example.roliudi.domain.repository.MoviesRepository
import org.koin.dsl.module

val domainModule = module {
    single<IMoviesRepository> { MoviesRepository(apiClient = get()) }
}