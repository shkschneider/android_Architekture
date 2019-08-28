package me.shkschneider.depencyinjection

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

object DependencyInjection {

    fun resolve(application: Application) = with(application) {
        startKoin {
            androidLogger()
            androidContext(application.applicationContext)
            androidFileProperties()
            modules(listOf(
                orderModule,
                productModule,
                userModule
            ))
        }
    }

}