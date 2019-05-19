package me.shkschneider.architekture

import android.app.Application
import me.shkschneider.dependencyinjection.dependencyInjection

@Suppress("unused")
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        dependencyInjection()
    }

}
