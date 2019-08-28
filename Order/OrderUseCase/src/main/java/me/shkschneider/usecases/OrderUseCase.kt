package me.shkschneider.usecases

import me.shkschneider.entities.Product
import me.shkschneider.entities.User
import me.shkschneider.repositories.OrderRepository

class OrderUseCase(
    private val orderRepository: OrderRepository
) {

    fun getOrder(user: User, product: Product) = orderRepository.getOrder(user, product)

}