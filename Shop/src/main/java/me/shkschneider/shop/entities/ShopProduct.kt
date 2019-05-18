package me.shkschneider.shop.entities

import me.shkschneider.entities.ITrackable
import me.shkschneider.entities.Product
import java.util.UUID

data class ScopedProduct(
    override val id: UUID
) : Product(id), ITrackable {
    override fun toTrackable() = listOf(id).map { it.toString() }
}

fun Product.toScopedProduct() = ScopedProduct(id)
