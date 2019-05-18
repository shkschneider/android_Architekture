package me.shkschneider.architekture

import android.app.Application
import me.shkschneider.order.OrderRepository
import me.shkschneider.order.OrderUseCase
import me.shkschneider.product.ProductRepository
import me.shkschneider.product.ProductUseCase
import me.shkschneider.user.UserRepository
import me.shkschneider.user.UserUseCase
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.module

fun Application.dependencyInjection() {
    startKoin(applicationContext, listOf(
        module("Repositories") {
            single { OrderRepository() }
            single { ProductRepository() }
            single { UserRepository() }
        },
        module("UseCases") {
            factory { OrderUseCase(get()) }
            factory { ProductUseCase(get()) }
            factory { UserUseCase(get()) }
        }
    ))
}
