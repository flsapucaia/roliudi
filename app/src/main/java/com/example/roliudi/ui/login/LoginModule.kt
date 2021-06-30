package com.example.roliudi.ui.login

import com.example.roliudi.data.remote.datasource.UserAuthenticationDataSource
import com.example.roliudi.domain.repository.userAuth.UserAuthRepository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val loginModule = module {
    single {
        UserAuthenticationDataSource(get())
    }

    single {
        UserAuthRepository(get())
    }

    viewModel {
        LoginViewModel(userAuthRepository = get())
    }
}