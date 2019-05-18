package me.shkschneider.product

import me.shkschneider.entities.AbstractProduct
import java.util.UUID

internal data class Product(
    override val id: UUID = UUID.randomUUID(),
    override val name: String
) : AbstractProduct(id, name)
