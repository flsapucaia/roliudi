package com.example.roliudi.ui.home

import com.example.roliudi.AppCore
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class HomePresenter(private val view: Home.View): Home.Presenter, CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main
    private var job: Job? = null

    override fun getMovieList() {
        job = launch {
            val result = withContext(Dispatchers.IO) {
                AppCore.movieRepository.getMovieList()
            }
            if (result.isNullOrEmpty()) {
                view.displayFailure(1)
            } else {
                view.setList(result)
            }
        }

    }

    override fun kill() {
        job?.cancel()
    }
}