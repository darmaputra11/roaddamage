package com.example.roaddamagedetection.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.roaddamagedetection.presentation.navigation.Screen
import com.example.roaddamagedetection.presentation.screen.HomeScreen
import com.example.roaddamagedetection.presentation.screen.HistoryScreen
import com.example.roaddamagedetection.presentation.screen.LoginScreen
import com.example.roaddamagedetection.presentation.screen.ProfileScreen
import com.example.roaddamagedetection.presentation.screen.SplashScreenView
import com.example.roaddamagedetection.presentation.screen.WelcomeScreen
import com.example.roaddamagedetection.presentation.screen.RegisterScreen
import com.example.roaddamagedetection.presentation.screen.EditProfileScreen
import com.example.roaddamagedetection.presentation.screen.MainScreen
import com.example.roaddamagedetection.presentation.ui.RoadDamageDetectionTheme

class FirstActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoadDamageDetectionTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = Screen.Splash.route
                ) {
                    composable(Screen.Splash.route) {
                        SplashScreenView {
                            navController.navigate(Screen.WelcomeScreen.route) {
                                popUpTo(Screen.Splash.route) { inclusive = true }
                            }
                        }
                    }

                    composable(Screen.Login.route) {
                        LoginScreen(navController)
                    }

                    composable(Screen.Main.route) {
                        MainScreen(navController) // navController dari FirstActivity
                    }


                    composable(Screen.Home.route) {
                        HomeScreen(navController)
                    }


                    composable(Screen.History.route) {
                        HistoryScreen(navController)
                    }

                    composable(Screen.Profile.route) {
                        ProfileScreen(navController)
                    }

                    composable(Screen.WelcomeScreen.route) {
                        WelcomeScreen(navController)
                    }

                    composable(Screen.RegisterScreen.route) {
                        RegisterScreen(navController)
                    }

                    composable(Screen.EditProfileScreen.route) {
                        EditProfileScreen(navController)
                    }
                }
            }
        }
    }
}
