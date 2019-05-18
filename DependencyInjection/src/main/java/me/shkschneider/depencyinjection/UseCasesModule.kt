package me.shkschneider.depencyinjection

import me.shkschneider.usecases.OrderUseCase
import me.shkschneider.usecases.ProductUseCase
import me.shkschneider.usecases.UserUseCase
import org.koin.dsl.module.module

val useCasesModule = module {
    factory { OrderUseCase(get()) }
    factory { ProductUseCase(get()) }
    factory { UserUseCase(get()) }
}
