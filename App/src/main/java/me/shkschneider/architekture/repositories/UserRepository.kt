package me.shkschneider.architekture.repositories

import me.shkschneider.architekture.entities.User

class UserRepository {

    fun getUser(name: String) = User(name = name)

}
