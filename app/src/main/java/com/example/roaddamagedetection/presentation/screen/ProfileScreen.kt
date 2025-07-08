package com.example.roaddamagedetection.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.roaddamagedetection.presentation.navigation.Screen
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.roaddamagedetection.presentation.ui.RoadDamageDetectionTheme


@Composable
fun ProfileScreen(navController: NavHostController, totalSessions: Int = 5) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Profil", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(16.dp))

        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = null,
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text("Nama: Pengguna Demo")
        Text("Total Sesi Tracking: $totalSessions")

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White        // Warna teks
            ),
            onClick = {
            navController.navigate(Screen.History.route)
        }) {
            Text("Lihat Riwayat Tracking")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfileScreenView() {
    RoadDamageDetectionTheme {
        ProfileScreen(navController = rememberNavController())
    }
}
