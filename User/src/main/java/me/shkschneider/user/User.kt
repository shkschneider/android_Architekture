package me.shkschneider.user

import me.shkschneider.entities.AbstractUser
import java.util.UUID

internal data class User(
    override val id: UUID = UUID.randomUUID(),
    override val name: String
) : AbstractUser(id, name)
