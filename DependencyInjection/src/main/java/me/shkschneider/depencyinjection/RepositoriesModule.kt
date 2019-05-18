package me.shkschneider.depencyinjection

import me.shkschneider.repositories.OrderRepository
import me.shkschneider.repositories.ProductRepository
import me.shkschneider.repositories.UserRepository
import org.koin.dsl.module.module

val repositoriesModule = module {
    single { OrderRepository() }
    single { ProductRepository() }
    single { UserRepository() }
}
