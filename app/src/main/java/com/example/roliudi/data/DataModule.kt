package com.example.roliudi.data

import com.example.roliudi.data.service.auth.UserAuthentication
import org.koin.dsl.module

val dataModule = module {
    single {
        UserAuthentication()
    }
}