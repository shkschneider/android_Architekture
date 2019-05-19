package me.shkschneider.order

import me.shkschneider.product.Product
import me.shkschneider.user.User

internal class OrderRepository {

    fun getOrder(user: User, product: Product) = Order(user = user, product = product)

}
