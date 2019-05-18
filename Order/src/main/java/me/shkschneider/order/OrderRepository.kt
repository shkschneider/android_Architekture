package me.shkschneider.order

import me.shkschneider.order.Order
import me.shkschneider.product.Product
import me.shkschneider.user.User

class OrderRepository {

    fun getOrder(user: me.shkschneider.user.User, product: me.shkschneider.product.Product) =
        me.shkschneider.order.Order(user = user, product = product)

}
