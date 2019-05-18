package me.shkschneider.order

import me.shkschneider.entities.AbstractProduct
import me.shkschneider.entities.AbstractUser

internal class OrderRepository {

    fun getOrder(user: AbstractUser, product: AbstractProduct) = Order(user = user, product = product)

}
