package me.shkschneider.architekture

import me.shkschneider.entities.ShopOrder
import me.shkschneider.entities.ShopProduct
import me.shkschneider.entities.ShopUser

object Tracker {

    fun track(shopOrder: ShopOrder) = listOf(shopOrder.id)

    fun track(shopProduct: ShopProduct) = listOf(shopProduct.id)

    fun track(shopUser: ShopUser) = listOf(shopUser.id)

}
