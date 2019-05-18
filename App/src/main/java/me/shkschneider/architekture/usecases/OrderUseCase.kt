package me.shkschneider.architekture.usecases

import me.shkschneider.architekture.entities.Product
import me.shkschneider.architekture.entities.User
import me.shkschneider.architekture.repositories.OrderRepository

class OrderUseCase(
    private val orderRepository: OrderRepository
) {

    fun getOrder(user: User, product: Product) = orderRepository.getOrder(user, product)

}