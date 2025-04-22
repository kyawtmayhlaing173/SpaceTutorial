package com.pinky.space_tutorial

import com.pinky.space_tutorial.cache.AndroidDatabaseDriverFactory
import com.pinky.space_tutorial.network.SpaceXAPI
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { SpaceXAPI() }
    single {
        SpaceXSDK(
            databaseDriverFactory = AndroidDatabaseDriverFactory(androidContext()),
            api = get()
        )
    }
    viewModel { RocketLaunchViewModel(sdk = get()) }
}