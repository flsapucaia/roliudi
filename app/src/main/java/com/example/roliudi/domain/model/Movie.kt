package com.example.roliudi.domain.model

import java.util.*

data class Movie (
    private val title: String,
    private val originalTitle: String,
    private val genre: String,
    private val overview: String,
    private val releaseDate: Date
)
