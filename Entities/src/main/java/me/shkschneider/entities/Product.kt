package me.shkschneider.entities

import java.util.UUID

open class Product(
    open val id: UUID = UUID.randomUUID(),
    open val name: String? = null
)
