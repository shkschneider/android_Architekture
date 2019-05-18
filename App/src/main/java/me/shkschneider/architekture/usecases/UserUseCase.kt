package me.shkschneider.architekture.usecases

import me.shkschneider.architekture.repositories.UserRepository

class UserUseCase(
    private val userRepository: UserRepository
) {

    fun getUser(name: String) = userRepository.getUser(name)

}
