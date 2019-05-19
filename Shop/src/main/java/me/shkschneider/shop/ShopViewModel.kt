package me.shkschneider.shop

import androidx.lifecycle.ViewModel
import me.shkschneider.entities.shop.ShopOrder
import me.shkschneider.order.OrderUseCase
import me.shkschneider.product.ProductUseCase
import me.shkschneider.user.UserUseCase
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class ShopViewModel : ViewModel(), KoinComponent {

    private val orderUseCase by inject<OrderUseCase>()
    private val productUseCase by inject<ProductUseCase>()
    private val userUseCase by inject<UserUseCase>()

    fun order(userName: String, productName: String): ShopOrder {
        val user = userUseCase.getUser(userName)
        val product = productUseCase.getProduct(productName)
        return orderUseCase.getOrder(user, product) as ShopOrder
    }

}