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
                            navController.navigate(Screen.Login.route) {
                                popUpTo(Screen.Splash.route) { inclusive = true }
                            }
                        }
                    }

                    composable(Screen.Login.route) {
                        LoginScreen(navController)
                    }


                    composable(Screen.Home.route) {
                        HomeScreen(navController)
                    }

                    composable(Screen.Camera.route) {
                        // Navigasi ke activity XML
                        val intent = Intent(this@FirstActivity, com.example.roaddamagedetection.MainActivity::class.java)
                        startActivity(intent)
                    }

                    composable(Screen.History.route) {
                        HistoryScreen()
                    }

                    composable(Screen.Profile.route) {
                        ProfileScreen(navController)
                    }
                }
            }
        }
    }
}
