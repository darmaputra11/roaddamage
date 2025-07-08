package com.example.roaddamagedetection.presentation.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Camera : Screen("camera")
    object History : Screen("history")
    object Profile : Screen("profile")
}