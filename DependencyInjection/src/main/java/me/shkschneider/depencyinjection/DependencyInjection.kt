package me.shkschneider.depencyinjection

import android.app.Application
import org.koin.android.ext.android.startKoin

object DependencyInjection {

    fun resolve(application: Application) = with(application) {
        startKoin(applicationContext, listOf(
            repositoriesModule,
            useCasesModule
        ))
    }

}