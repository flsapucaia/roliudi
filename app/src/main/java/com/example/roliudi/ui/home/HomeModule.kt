package com.example.roliudi.ui.home

import org.koin.dsl.module

val homeModule = module {
    factory<Home.Presenter> { (view: Home.View) ->
        HomePresenter(
            view = view,
            movieRepository = get()
        )
    }
}
