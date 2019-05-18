package me.shkschneider.entities

import java.util.UUID

open class AbstractOrder(
    open val id: UUID,
    open val user: AbstractUser,
    open val product: AbstractProduct
)
