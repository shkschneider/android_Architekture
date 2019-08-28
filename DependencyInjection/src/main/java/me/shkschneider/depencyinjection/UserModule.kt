package me.shkschneider.depencyinjection

import me.shkschneider.repositories.UserRepository
import me.shkschneider.usecases.UserUseCase
import org.koin.dsl.module

val userModule = module {
    single { UserRepository() }
    factory { UserUseCase(get()) }
}