package me.shkschneider.user

import org.koin.dsl.module.module

object UserModule {

    val module = module {
        single { UserRepository() }
        factory { UserUseCase() }
    }

}
