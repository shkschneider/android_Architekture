package me.shkschneider.user

import me.shkschneider.entities.AbstractUser
import java.util.UUID

internal class User(
    override val id: UUID = UUID.randomUUID(),
    val name: String? = null
) : AbstractUser
