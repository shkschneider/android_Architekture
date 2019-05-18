package me.shkschneider.architekture

import android.app.Application
import me.shkschneider.shop.ShopModule
import org.koin.android.ext.android.startKoin

@Suppress("unused")
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(
            applicationContext, listOf(
                ShopModule.module
            )
        )
    }

}
