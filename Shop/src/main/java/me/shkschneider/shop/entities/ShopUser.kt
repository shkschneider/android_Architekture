package me.shkschneider.shop.entities

import me.shkschneider.entities.ITrackable
import me.shkschneider.entities.User
import java.util.UUID

data class ScopedUser(
    override val id: UUID
) : User(id), ITrackable {
    override fun toTrackable() = listOf(id).map { it.toString() }
}

fun User.toScopedUser() = ScopedUser(id)
