package me.shkschneider.order

import me.shkschneider.entities.AbstractOrder
import me.shkschneider.entities.AbstractProduct
import me.shkschneider.entities.AbstractUser
import java.util.UUID

internal data class Order(
    override val id: UUID = UUID.randomUUID(),
    override val user: AbstractUser,
    override val product: AbstractProduct
) : AbstractOrder(id, user, product)
