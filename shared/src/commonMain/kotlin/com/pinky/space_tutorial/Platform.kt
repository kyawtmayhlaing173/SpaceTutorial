package com.pinky.space_tutorial

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform