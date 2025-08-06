package com.example.roaddamagedetection.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.roaddamagedetection.model.HistoryItem

@Composable
fun HistoryCard(item: HistoryItem) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF8F1FF), shape = RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Text(
            text = "Estimasi Kerusakan : ${item.damageEstimate} %",
            style = MaterialTheme.typography.labelSmall.copy(
                color = Color.Gray
            )
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = item.location,
            style = MaterialTheme.typography.bodyMedium.copy(
                fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold,
                color = Color.Black
            )
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = item.dateTime,
            style = MaterialTheme.typography.bodySmall.copy(color = Color.Gray)
        )
    }
}
