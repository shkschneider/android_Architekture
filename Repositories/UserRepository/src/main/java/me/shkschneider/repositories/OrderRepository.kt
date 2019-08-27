package me.shkschneider.repositories

import me.shkschneider.entities.Order
import me.shkschneider.entities.Product
import me.shkschneider.entities.User

class OrderRepository {

    fun getOrder(user: User, product: Product) =
        Order(user = user, product = product)

}
