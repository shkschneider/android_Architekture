package me.shkschneider.user

import me.shkschneider.entities.AbstractUser
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class UserUseCase : KoinComponent {

    private val userRepository by inject<UserRepository>()

    fun getUser(name: String) = userRepository.getUser(name) as AbstractUser

}
