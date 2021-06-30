package com.example.roliudi.ui.about

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val aboutModule = module {
    viewModel {
        AboutViewModel()
    }

}