package com.example.lib

data class DroidGreetingName(val name: String)

fun getDroidGreetingName() = DroidGreetingName("From Droid Module")