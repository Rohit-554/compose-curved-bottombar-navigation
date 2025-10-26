package io.jadu.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun SampleScreens(
    currentIndex: Int
) {
    val screens = listOf(
        "Home" to Color(0xFFFDEFD5),
        "Search" to Color(0xFFE3F2FD),
        "Moments" to Color(0xFFF3E5F5),
        "Friends" to Color(0xFFE8F5E9),
        "You" to Color(0xFFFFF3E0),
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(screens[currentIndex].second),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = screens[currentIndex].first,
            fontSize = 72.sp,
            color = Color.Black,
            fontWeight = FontWeight.Black,
        )
    }
}