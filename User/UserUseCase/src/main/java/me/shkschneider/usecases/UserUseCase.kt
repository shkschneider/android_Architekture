package me.shkschneider.usecases

import me.shkschneider.repositories.UserRepository

class UserUseCase(
    private val userRepository: UserRepository
) {

    fun getUser(name: String) = userRepository.getUser(name)

}
