package me.shkschneider.order

import org.koin.dsl.module.module

object OrderModule {

    val module = module {
        single { OrderRepository() }
        factory { OrderUseCase() }
    }

}
