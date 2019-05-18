package me.shkschneider.order

import me.shkschneider.product.Product
import me.shkschneider.user.User
import java.util.UUID

data class Order(
    val id: UUID = UUID.randomUUID(),
    val user: User,
    val product: Product
)
