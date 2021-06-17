package com.example.roliudi.domain.model

import com.google.gson.annotations.SerializedName
import java.time.Year
import java.util.*

data class Movie (

    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("poster_path")
    val coverPath: String?,
    @SerializedName("original_title")
    val originalTitle: String,
    @SerializedName("genre_ids")
    val genre: List<Int>,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("release_date")
    val releaseDate: String
)
