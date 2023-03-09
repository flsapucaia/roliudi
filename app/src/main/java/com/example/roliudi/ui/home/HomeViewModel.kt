package com.example.roliudi.ui.home

import com.example.roliudi.AppCore
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class HomeViewModel(private val view: Home.View):CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main
    private var job: Job? = null



    fun getMovieList() {
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

    fun kill() {
        job?.cancel()
    }
}