package me.shkschneider.user

import me.shkschneider.entities.User

class UserRepository {

    fun getUser(name: String) = User(name = name)

}
