package me.shkschneider.product

import org.koin.dsl.module.module

object ProductModule {

    val module = module {
        single { ProductRepository() }
        factory { ProductUseCase() }
    }

}
