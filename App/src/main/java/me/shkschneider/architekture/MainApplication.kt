package me.shkschneider.architekture

import android.app.Application
import me.shkschneider.order.OrderModule
import me.shkschneider.product.ProductModule
import me.shkschneider.user.UserModule
import org.koin.android.ext.android.startKoin

@Suppress("unused")
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(applicationContext, listOf(
            OrderModule.module,
            ProductModule.module,
            UserModule.module
        ))
    }

}
