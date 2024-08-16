package org.extoy.wumajiang

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform