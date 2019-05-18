package me.shkschneider.architekture

import android.app.Application
import me.shkschneider.architekture.repositories.OrderRepository
import me.shkschneider.architekture.repositories.ProductRepository
import me.shkschneider.architekture.repositories.UserRepository
import me.shkschneider.architekture.usecases.OrderUseCase
import me.shkschneider.architekture.usecases.ProductUseCase
import me.shkschneider.architekture.usecases.UserUseCase
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
