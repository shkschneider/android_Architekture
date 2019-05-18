package me.shkschneider.entities

import java.util.UUID

open class User(
    open val id: UUID = UUID.randomUUID(),
    open val name: String? = null
)
