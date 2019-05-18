package me.shkschneider.shop

import androidx.lifecycle.ViewModel
import me.shkschneider.order.OrderUseCase
import me.shkschneider.product.ProductUseCase
import me.shkschneider.shop.entities.ScopedProduct
import me.shkschneider.shop.entities.ScopedUser
import me.shkschneider.shop.entities.toScopedOrder
import me.shkschneider.shop.entities.toScopedProduct
import me.shkschneider.shop.entities.toScopedUser
import me.shkschneider.user.UserUseCase
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class ShopViewModel : ViewModel(), KoinComponent {

    private val orderUseCase by inject<OrderUseCase>()
    private val productUseCase by inject<ProductUseCase>()
    private val userUseCase by inject<UserUseCase>()

    fun getUser(name: String) = userUseCase.getUser(name).toScopedUser()

    fun getProduct(name: String) = productUseCase.getProduct(name).toScopedProduct()

    fun getOrder(user: ScopedUser, product: ScopedProduct) = orderUseCase.getOrder(user, product).toScopedOrder()

}