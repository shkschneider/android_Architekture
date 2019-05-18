package me.shkschneider.architekture.repositories

import me.shkschneider.architekture.entities.Order
import me.shkschneider.architekture.entities.Product
import me.shkschneider.architekture.entities.User

class OrderRepository {

    fun getOrder(user: User, product: Product) = Order(user = user, product = product)

}
