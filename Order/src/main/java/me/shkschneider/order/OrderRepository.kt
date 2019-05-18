package me.shkschneider.order

import me.shkschneider.entities.Order
import me.shkschneider.entities.Product
import me.shkschneider.entities.User

internal class OrderRepository {

    fun getOrder(user: User, product: Product) = Order(user = user, product = product)

}
