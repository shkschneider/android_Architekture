package me.shkschneider.user

class UserUseCase(
    private val userRepository: UserRepository
) {

    fun getUser(name: String) = userRepository.getUser(name)

}
