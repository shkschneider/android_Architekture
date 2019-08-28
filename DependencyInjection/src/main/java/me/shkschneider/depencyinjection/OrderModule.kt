package me.shkschneider.depencyinjection

import me.shkschneider.repositories.OrderRepository
import me.shkschneider.usecases.OrderUseCase
import org.koin.dsl.module

val orderModule = module {
    single { OrderRepository() }
    factory { OrderUseCase(get()) }
}