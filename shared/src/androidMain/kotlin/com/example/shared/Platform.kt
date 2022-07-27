package com.example.shared

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

data class GreetingName(val name: String)

fun getGreetingName() = GreetingName("From Shared Module")

