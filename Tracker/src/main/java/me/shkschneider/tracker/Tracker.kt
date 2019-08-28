package me.shkschneider.tracker

import me.shkschneider.entities.Order
import me.shkschneider.entities.Product
import me.shkschneider.entities.User

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
