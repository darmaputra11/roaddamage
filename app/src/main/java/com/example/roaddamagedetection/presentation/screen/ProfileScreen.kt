package com.example.roaddamagedetection.presentation.screen

import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.roaddamagedetection.presentation.navigation.Screen
import com.example.roaddamagedetection.presentation.ui.RoadDamageDetectionTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Profile")
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.White
                ),
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(24.dp)
                .fillMaxSize()
        ) {
            // Kartu Info User
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF126682)
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = null,
                        modifier = Modifier.size(50.dp),
                        tint = Color(0xFFE0BBF4)
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    Column {
                        Text(
                            text = "I Gede Darma Putra",
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "darmaputra11@gmail.com",
                            color = Color.White
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Menu Edit Profile
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { navController.navigate(Screen.EditProfileScreen.route) }
                    .padding(vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Edit Profile", modifier = Modifier.weight(1f))
                Icon(Icons.Default.KeyboardArrowRight, contentDescription = null)
            }

            Divider()

            // Menu Tentang Aplikasi
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { /* TODO: Navigate to about screen */ }
                    .padding(vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Tentang Aplikasi", modifier = Modifier.weight(1f))
                Icon(Icons.Default.KeyboardArrowRight, contentDescription = null)
            }

            Divider()

            Spacer(modifier = Modifier.height(40.dp))

            // Tombol Logout
            Button(
                onClick = {
                    navController.navigate(Screen.WelcomeScreen.route)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) {
                Text("Keluar")
            }
        }
    }



@Composable
fun ProfileScreenView() {
    RoadDamageDetectionTheme {
        ProfileScreen(navController = rememberNavController())
    }
}}
