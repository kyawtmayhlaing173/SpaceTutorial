package com.pinky.space_tutorial

import com.pinky.space_tutorial.cache.IOSDatabaseDriverFactory
import com.pinky.space_tutorial.entity.RocketLaunch
import com.pinky.space_tutorial.network.SpaceXAPI
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import org.koin.dsl.module

class KoinHelper: KoinComponent {
    private val sdk: SpaceXSDK by inject<SpaceXSDK>()

    suspend fun getLaunches(forceReload: Boolean): List<RocketLaunch> {
        return sdk.getLaunches(forceReload = forceReload)
    }

    fun initKoin() {
        startKoin {
            modules(module {
                single<SpaceXAPI> { SpaceXAPI() }
                single<SpaceXSDK> {
                    SpaceXSDK(
                        databaseDriverFactory = IOSDatabaseDriverFactory(),
                        api = get()
                    )
                }
            })
        }
    }
}