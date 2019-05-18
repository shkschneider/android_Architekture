package me.shkschneider.entities

import java.util.UUID

open class AbstractUser(
    open val id: UUID,
    open val name: String
) : ITrackable {
    override fun toTrackable() = listOf(id, name)
}
