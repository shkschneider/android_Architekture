package me.shkschneider.order

import me.shkschneider.entities.ShopOrder
import me.shkschneider.product.Product
import me.shkschneider.user.User
import java.util.UUID

class Order(
    override val id: UUID = UUID.randomUUID(),
    val user: User? = null,
    val product: Product? = null
) : ShopOrder
