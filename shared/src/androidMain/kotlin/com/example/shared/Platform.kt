package com.example.shared

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

data class SharedGreetingName(val name: String)

fun getSharedGreetingName() = SharedGreetingName("From Shared Module")

