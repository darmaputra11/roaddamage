package com.example.roaddamagedetection.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.roaddamagedetection.presentation.navigation.Screen
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.roaddamagedetection.presentation.ui.RoadDamageDetectionTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import com.example.roaddamagedetection.R
import com.example.roaddamagedetection.presentation.ui.PrimaryButton
import com.example.roaddamagedetection.presentation.ui.BaseColor

@Composable
fun WelcomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .background(BaseColor)
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Logo
        Image(
            painter = painterResource(id = R.drawable.splashlogo),
            contentDescription = "App Logo",
            modifier = Modifier
                .width(400.dp)
                .height(400.dp)
        )


        Spacer(modifier = Modifier.height(24.dp))

        // Teks selamat datang
        Text(
            text = "Welcome to DIJARIKU",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start

        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Membantu melaporkan jalanan rusak dengan mudah",
            fontSize = 16.sp,
            color = Color.White,
            style = TextStyle(lineHeight = 20.sp),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Tombol ungu (Login)
        Button(
            onClick = {
                navController.navigate(Screen.Login.route)
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryButton, // Warna ungu
                contentColor = Color.White
            )
        ) {
            Text("Login")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Tombol putih (Login alternatif)
        Button(
            onClick = {
                navController.navigate(Screen.RegisterScreen.route)
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            )
        ) {
            Text("Register")
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WelcomeScreen() {
    RoadDamageDetectionTheme {
        WelcomeScreen(navController = rememberNavController())
    }
}
