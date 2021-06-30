package com.example.roliudi.data

import com.example.roliudi.data.remote.datasource.IUserAuthenticationDataSource
import com.example.roliudi.data.remote.datasource.UserAuthenticationDataSource
import com.google.firebase.auth.FirebaseAuth
import org.koin.dsl.module

val dataModule = module {
    single {
        FirebaseAuth.getInstance()
    }

    single<IUserAuthenticationDataSource> {
        UserAuthenticationDataSource(mAuth = get())
    }
}