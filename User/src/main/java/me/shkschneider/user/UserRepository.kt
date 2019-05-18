package me.shkschneider.user

import me.shkschneider.entities.User

internal class UserRepository {

    fun getUser(name: String) = User(name = name)

}
