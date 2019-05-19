package me.shkschneider.tracking

import android.content.Context
import me.shkschneider.entities.AbstractOrder
import me.shkschneider.entities.AbstractProduct
import me.shkschneider.entities.AbstractUser

class Tracker(val context: Context) {

    fun track(shopOrder: AbstractOrder) = listOf(shopOrder.id)

    fun track(shopProduct: AbstractProduct) = listOf(shopProduct.id)

    fun track(shopUser: AbstractUser) = listOf(shopUser.id)

}
