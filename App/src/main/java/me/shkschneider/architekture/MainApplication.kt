package me.shkschneider.architekture

import android.app.Application
import me.shkschneider.depencyinjection.DependencyInjection

@Suppress("unused")
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DependencyInjection.resolve(this@MainApplication)
    }

}
