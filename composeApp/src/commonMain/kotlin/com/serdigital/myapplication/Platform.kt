package com.serdigital.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform