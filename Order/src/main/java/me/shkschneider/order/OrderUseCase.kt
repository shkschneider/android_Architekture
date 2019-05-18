package me.shkschneider.order

import me.shkschneider.product.Product
import me.shkschneider.user.User

class OrderUseCase(
    private val orderRepository: OrderRepository
) {

    fun getOrder(user: User, product: Product) = orderRepository.getOrder(user, product)

}