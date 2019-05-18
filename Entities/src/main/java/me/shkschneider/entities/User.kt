package me.shkschneider.entities

import java.util.UUID

data class User(
    val id: UUID = UUID.randomUUID(),
    val name: String
)
