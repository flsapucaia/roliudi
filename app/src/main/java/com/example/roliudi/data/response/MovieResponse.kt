package com.example.roliudi.data.response

import com.example.roliudi.domain.model.Movie
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MovieResponse (
    @SerializedName("page")
    @Expose
    val page: Int,

    @SerializedName("total_pages")
    @Expose
    var totalPages: Int? = null,

    @SerializedName("results")
    @Expose
    val results: List<Movie>
)