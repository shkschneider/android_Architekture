package me.shkschneider.order

import me.shkschneider.product.Product
import me.shkschneider.user.User
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class OrderUseCase : KoinComponent {

    private val orderRepository by inject<OrderRepository>()

    fun getOrder(user: User, product: Product) = orderRepository.getOrder(user, product)

}
