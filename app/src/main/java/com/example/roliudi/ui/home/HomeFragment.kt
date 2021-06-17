package com.example.roliudi.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.roliudi.R
import com.example.roliudi.domain.model.Movie
import com.example.roliudi.ui.movieadapter.MovieAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment: Fragment(), Home.View, MovieAdapter.Listener {
    private val movieList = mutableListOf<Movie>()
    private var adapter: MovieAdapter? = null
    val navController by lazy { findNavController() }
    private lateinit var presenter: Home.Presenter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        presenter = HomePresenter(this)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = MovieAdapter(movieList, this)
        home_rv?.adapter = adapter
        makeRequest()

    }

    override fun setList(movies: List<Movie>) {
        movieList.clear()
        movieList.addAll(movies)

        adapter?.notifyDataSetChanged()
    }

    override fun makeRequest() {
        presenter.getMovieList()
    }

    override fun displayFailure(error: Int) {
        Toast.makeText(context, "Erro na solicitação", Toast.LENGTH_LONG).show()
    }
}