package com.example.roaddamagedetection.presentation.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.roaddamagedetection.model.HistoryItem
import com.example.roaddamagedetection.presentation.component.HistoryCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HistoryScreen(navController: NavHostController) {
    val dummyHistory = listOf(
        HistoryItem(85, "Jalan Besakih sepanjang 100 Meter", "24 Juli 2025, 15.00 WITA"),
        HistoryItem(85, "Jalan Besakih sepanjang 100 Meter", "24 Juli 2025, 15.00 WITA"),
        HistoryItem(85, "Jalan Besakih sepanjang 100 Meter", "24 Juli 2025, 15.00 WITA"),
        HistoryItem(85, "Jalan Besakih sepanjang 100 Meter", "24 Juli 2025, 15.00 WITA"),
        HistoryItem(85, "Jalan Besakih sepanjang 100 Meter", "24 Juli 2025, 15.00 WITA"),
        HistoryItem(85, "Jalan Besakih sepanjang 100 Meter", "24 Juli 2025, 15.00 WITA"),
        HistoryItem(85, "Jalan Besakih sepanjang 100 Meter", "24 Juli 2025, 15.00 WITA"),
        HistoryItem(85, "Jalan Besakih sepanjang 100 Meter", "24 Juli 2025, 15.00 WITA"),
        HistoryItem(85, "Jalan Besakih sepanjang 100 Meter", "24 Juli 2025, 15.00 WITA"),
        HistoryItem(85, "Jalan Besakih sepanjang 100 Meter", "24 Juli 2025, 15.00 WITA")
    )

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Riwayat")
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.White
                ),
            )
        }
    ) { innerPadding ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(innerPadding)
        ) {
            items(dummyHistory) { item ->
                HistoryCard(item)
            }
        }
    }
}
