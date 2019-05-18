package me.shkschneider.architekture

import me.shkschneider.entities.AbstractOrder
import me.shkschneider.entities.AbstractProduct
import me.shkschneider.entities.AbstractUser

object Tracker {

    fun track(user: AbstractUser) = run {
        user.id
        user.name
    }

    fun track(order: AbstractOrder) = run {
        order.id
        order.product
        order.user
    }

    fun track(product: AbstractProduct) = run {
        product.id
        product.name
    }

}
