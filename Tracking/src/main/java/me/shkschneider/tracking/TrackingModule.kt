package me.shkschneider.tracking

import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

object TrackingModule {

    val module = module {
        single { Tracker(androidContext()) }
    }

}
