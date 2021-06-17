package com.example.roliudi

import android.app.Application
import com.example.roliudi.data.dataModule
import com.example.roliudi.domain.domainModule
import com.example.roliudi.ui.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class AppCore: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin()
    }

    private fun startKoin() = startKoin {
        androidLogger(Level.DEBUG)
        androidContext(this@AppCore)
        modules(dataModule + domainModule + uiModule)
    }
}