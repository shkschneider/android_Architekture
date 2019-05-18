package me.shkschneider.shop.entities

import me.shkschneider.entities.ITrackable
import me.shkschneider.entities.Order
import java.util.UUID

data class ScopedOrder(
    override val id: UUID
) : Order(id), ITrackable {
    override fun toTrackable() = listOf(id, user?.id, product?.id).mapNotNull { it.toString() }
}

fun Order.toScopedOrder() = ScopedOrder(id)
