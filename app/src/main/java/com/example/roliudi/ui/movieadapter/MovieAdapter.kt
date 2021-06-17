package com.example.roliudi.ui.movieadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roliudi.R
import com.example.roliudi.domain.model.Movie


class MovieAdapter(private val movieList: List<Movie>,
    private val listener: Listener) :
    RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_movie, parent, false)
        return MovieViewHolder(v, movieList)
    }


    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount() = movieList.size

    interface Listener{

    }
}