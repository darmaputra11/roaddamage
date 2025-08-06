package com.example.roaddamagedetection.presentation.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.roaddamagedetection.presentation.navigation.Screen

data class BottomNavItem(
    val title: String,
    val icon: ImageVector,
    val screen: Screen
)

val bottomNavItems = listOf(
    BottomNavItem("Rekam", Icons.Default.PlayArrow, Screen.Home),
    BottomNavItem("Riwayat", Icons.Default.DateRange, Screen.History),
    BottomNavItem("Akun", Icons.Default.AccountCircle, Screen.Profile)
)
