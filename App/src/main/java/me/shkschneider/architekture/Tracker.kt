package me.shkschneider.architekture

import me.shkschneider.entities.Order
import me.shkschneider.entities.Product
import me.shkschneider.entities.User

object Tracker {

    fun track(user: me.shkschneider.entities.User) = run {
        user.id
        user.name
    }

    fun track(order: me.shkschneider.entities.Order) = run {
        order.id
        order.product
        order.user
    }

    fun track(product: me.shkschneider.entities.Product) = run {
        product.id
        product.name
    }

}
