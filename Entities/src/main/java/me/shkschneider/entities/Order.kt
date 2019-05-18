package me.shkschneider.entities

import java.util.UUID

data class Order(
    val id: UUID = UUID.randomUUID(),
    val user: User,
    val product: Product
)
