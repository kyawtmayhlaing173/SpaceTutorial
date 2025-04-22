package com.pinky.space_tutorial

import com.pinky.space_tutorial.cache.Database
import com.pinky.space_tutorial.cache.DatabaseDriverFactory
import com.pinky.space_tutorial.entity.RocketLaunch
import com.pinky.space_tutorial.network.SpaceXAPI

class SpaceXSDK(databaseDriverFactory: DatabaseDriverFactory, val api: SpaceXAPI) {
    private val database = Database(databaseDriverFactory)

    @Throws(Exception::class)
    suspend fun getLaunches(forceReload: Boolean): List<RocketLaunch> {
        val cacheLaunch = database.getAllLaunches()
        return if (cacheLaunch.isNotEmpty() && !forceReload) {
            cacheLaunch
        } else {
            api.getAllLaunches().also {
                database.clearAndCreateLaunches(it)
            }
        }
    }
}