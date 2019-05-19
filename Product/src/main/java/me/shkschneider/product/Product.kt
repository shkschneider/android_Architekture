package me.shkschneider.product

import me.shkschneider.entities.ShopProduct
import java.util.UUID

class Product(
    override val id: UUID = UUID.randomUUID(),
    val name: String? = null
) : ShopProduct
