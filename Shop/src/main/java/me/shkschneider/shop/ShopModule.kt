package me.shkschneider.shop

import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

object ShopModule {

    val module = module {
        viewModel { ShopViewModel() }
    }

}
