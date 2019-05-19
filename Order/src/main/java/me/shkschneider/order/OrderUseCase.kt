package me.shkschneider.order

import me.shkschneider.entities.AbstractOrder
import me.shkschneider.entities.AbstractProduct
import me.shkschneider.entities.AbstractUser
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class OrderUseCase : KoinComponent {

    private val orderRepository by inject<OrderRepository>()

    fun getOrder(user: AbstractUser, product: AbstractProduct) = orderRepository.getOrder(user, product) as AbstractOrder

}
