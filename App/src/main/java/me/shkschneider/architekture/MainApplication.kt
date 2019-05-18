package me.shkschneider.architekture

import android.app.Application

@Suppress("unused")
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        dependencyInjection()
    }

}
