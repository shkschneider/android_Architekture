package me.shkschneider.user

import me.shkschneider.entities.ShopUser
import java.util.UUID

class User(
    override val id: UUID = UUID.randomUUID(),
    val name: String? = null
) : ShopUser
