package com.example.roliudi.ui.movieadapter

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.roliudi.R
import com.example.roliudi.data.Constants
import com.example.roliudi.domain.model.Movie
import kotlinx.android.synthetic.main.card_movie.view.*

class MovieViewHolder(itemView: View, movieList: List<Movie>) :
    RecyclerView.ViewHolder(itemView){

    private val movieList = movieList

    fun bind(position: Int) = with(itemView){
        itemView.movie_title_tv.text = movieList[position].title
        itemView.movie_genre_tv.text = movieList[position].genre.toString()
        itemView.movie_year_tv.text = movieList[position].releaseDate


        if(movieList[position].coverPath != null){
            Glide.with(context)
                .load(Constants.imageUrlMovie + movieList[position].coverPath)
                .into(itemView.movie_cover_iv)

        } else{
            Glide.with(context).clear(itemView.movie_cover_iv)
            itemView.movie_cover_iv.setImageDrawable(null)
        }

        itemView.movie_cv.setOnClickListener {

            Toast.makeText(context, movieList[position].title, Toast.LENGTH_SHORT).show()

        }
    }
}