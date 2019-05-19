package me.shkschneider.product

import me.shkschneider.entities.AbstractProduct
import java.util.UUID

internal class Product(
    override val id: UUID = UUID.randomUUID(),
    val name: String? = null
) : AbstractProduct
