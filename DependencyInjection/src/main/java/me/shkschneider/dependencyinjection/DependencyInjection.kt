package me.shkschneider.dependencyinjection

import android.app.Application
import me.shkschneider.order.OrderModule
import me.shkschneider.product.ProductModule
import me.shkschneider.shop.ShopModule
import me.shkschneider.user.UserModule
import org.koin.android.ext.android.startKoin

fun Application.dependencyInjection() {
    startKoin(
        applicationContext, listOf(
            OrderModule.module,
            ProductModule.module,
            ShopModule.module,
            UserModule.module
        )
    )
}
