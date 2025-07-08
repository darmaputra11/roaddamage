package com.example.roaddamagedetection.presentation.ui

import android.R
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = Color(0xFF03DAC6),
    tertiary = PrimaryDark
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = Color(0xFF03DAC6),
    tertiary = PrimaryLight
)

@Composable
fun RoadDamageDetectionTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        content = content
    )
}