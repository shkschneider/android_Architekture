package me.shkschneider.shop

import me.shkschneider.order.OrderModule
import me.shkschneider.product.ProductModule
import me.shkschneider.user.UserModule
import org.koin.dsl.module.module

object ShopModule {

    val module = module {
        OrderModule.module
        ProductModule.module
        UserModule.module
    }

}
