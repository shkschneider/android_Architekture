package me.shkschneider.architekture

import me.shkschneider.architekture.repositories.OrderRepository
import me.shkschneider.architekture.repositories.ProductRepository
import me.shkschneider.architekture.repositories.UserRepository
import me.shkschneider.architekture.usecases.OrderUseCase
import me.shkschneider.architekture.usecases.ProductUseCase
import me.shkschneider.architekture.usecases.UserUseCase
import org.koin.dsl.module.module

object KoinModule {

    val app = module {
        single { OrderRepository() }
        single { ProductRepository() }
        single { UserRepository() }
        factory { OrderUseCase(get()) }
        factory { ProductUseCase(get()) }
        factory { UserUseCase(get()) }
    }

}
