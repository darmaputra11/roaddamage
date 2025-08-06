package com.example.roaddamagedetection.presentation.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Home : Screen("home")
    object History : Screen("history")
    object Profile : Screen("profile")
    object Login : Screen("login")
    object WelcomeScreen : Screen("welcomescreen")
    object RegisterScreen : Screen("register")
    object EditProfileScreen : Screen("editprofile")
    object Main : Screen("main")
    }
