package me.shkschneider.architekture

import me.shkschneider.entities.AbstractOrder
import me.shkschneider.entities.AbstractProduct
import me.shkschneider.entities.AbstractUser

object Tracker {

    fun track(shopOrder: AbstractOrder) = listOf(shopOrder.id)

    fun track(shopProduct: AbstractProduct) = listOf(shopProduct.id)

    fun track(shopUser: AbstractUser) = listOf(shopUser.id)

}
