package me.shkschneider.order

import me.shkschneider.entities.Product
import me.shkschneider.entities.User

class OrderUseCase(
    private val orderRepository: OrderRepository
) {

    fun getOrder(user: User, product: Product) = orderRepository.getOrder(user, product)

}