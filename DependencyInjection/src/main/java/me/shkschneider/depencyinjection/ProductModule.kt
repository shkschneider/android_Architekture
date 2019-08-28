package me.shkschneider.depencyinjection

import me.shkschneider.repositories.ProductRepository
import me.shkschneider.usecases.ProductUseCase
import org.koin.dsl.module

val productModule = module {
    single { ProductRepository() }
    factory { ProductUseCase(get()) }
}