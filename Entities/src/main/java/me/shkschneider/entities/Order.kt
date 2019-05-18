package me.shkschneider.entities

import java.util.UUID

open class Order(
    open val id: UUID = UUID.randomUUID(),
    open val user: User? = null,
    open val product: Product? = null
)
