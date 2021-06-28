package com.example.roliudi.core

import android.app.Application
import com.example.roliudi.data.dataModule
import com.example.roliudi.domain.repositoryModule
import com.example.roliudi.ui.about.aboutModule
import com.example.roliudi.ui.home.homeModule
import com.example.roliudi.ui.login.loginModule
import com.example.roliudi.ui.main.mainModule
import com.example.roliudi.ui.register.registerModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin ()
    }
    private fun startKoin () {
        startKoin {
            androidLogger()
            androidContext(this@App)

            modules(
                repositoryModule,
                dataModule,
                mainModule,
                loginModule,
                homeModule,
                aboutModule,
                registerModule
            )
        }
    }
}