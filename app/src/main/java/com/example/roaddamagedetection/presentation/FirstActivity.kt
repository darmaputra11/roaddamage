package com.example.roaddamagedetection.presentation

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.roaddamagedetection.presentation.navigation.Screen
import com.example.roaddamagedetection.MainActivity
import com.example.roaddamagedetection.presentation.screen.HomeScreen
import com.example.roaddamagedetection.presentation.screen.HistoryScreen
import com.example.roaddamagedetection.presentation.screen.ProfileScreen
import com.example.roaddamagedetection.presentation.ui.RoadDamageDetectionTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoadDamageDetectionTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = Screen.Home.route
                ) {
                    composable(Screen.Home.route) {
                        HomeScreen(navController = navController)
                    }

                    // Untuk Camera (XML Activity)
                    composable(Screen.Camera.route) {
                        val intent = Intent(this@MainActivity, com.example.roaddamagedetection.MainActivity::class.java)
                        startActivity(intent)
                    }

                    composable(Screen.History.route) {
                        HistoryScreen()
                    }

                    composable(Screen.Profile.route) {
                        ProfileScreen()
                    }
                }
            }
        }
    }
}