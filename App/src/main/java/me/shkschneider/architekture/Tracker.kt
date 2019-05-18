package me.shkschneider.architekture

import me.shkschneider.order.Order
import me.shkschneider.product.Product
import me.shkschneider.user.User

object Tracker {

    fun track(user: User) = run {
        user.id
        user.name
    }

    fun track(order: Order) = run {
        order.id
        order.product
        order.user
    }

    fun track(product: Product) = run {
        product.id
        product.name
    }

}
