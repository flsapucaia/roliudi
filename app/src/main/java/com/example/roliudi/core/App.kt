package com.example.roliudi.core

import android.app.Application
import com.example.roliudi.domain.repository.UserAuthRepository

class App: Application() {
    companion object{
        val userAuthRepository = UserAuthRepository()
    }
}