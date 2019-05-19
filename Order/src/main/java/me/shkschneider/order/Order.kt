package me.shkschneider.order

import me.shkschneider.entities.AbstractOrder
import me.shkschneider.entities.AbstractProduct
import me.shkschneider.entities.AbstractUser
import me.shkschneider.entities.shop.ShopOrder
import java.util.UUID

internal class Order(
    override val id: UUID = UUID.randomUUID(),
    val user: AbstractUser? = null,
    val product: AbstractProduct? = null
) : AbstractOrder, ShopOrder
