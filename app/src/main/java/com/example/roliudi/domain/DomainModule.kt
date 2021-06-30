package com.example.roliudi.domain

import com.example.roliudi.data.remote.datasource.IUserAuthenticationDataSource
import com.example.roliudi.data.remote.datasource.UserAuthenticationDataSource
import com.example.roliudi.domain.repository.userAuth.IUserAuthRepository
import com.example.roliudi.domain.repository.userAuth.UserAuthRepository
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val domainModule = module {
    single<IUserAuthenticationDataSource> {
        UserAuthenticationDataSource(get())
    }

    single<IUserAuthRepository> {
        UserAuthRepository(get())
    }
}