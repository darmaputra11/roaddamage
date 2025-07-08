package com.example.roaddamagedetection.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import com.example.roaddamagedetection.R
import com.example.roaddamagedetection.presentation.ui.RoadDamageDetectionTheme

@Composable
fun SplashScreenView(onTimeout: () -> Unit) {
    LaunchedEffect(Unit) {
        delay(2000) // splash delay 2 detik
        onTimeout()
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.primary
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.splashlogo),
                contentDescription = "App Logo",
                modifier = Modifier
                    .width(300.dp)
                    .height(300.dp)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SplashScreenPreview() {
    RoadDamageDetectionTheme {
        SplashScreenView(onTimeout = {})
    }
}
