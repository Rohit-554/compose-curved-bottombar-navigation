package io.jadu.sample

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview

import io.jadu.animatedBottomBar.CurvedBottomNavigation

@Composable
@Preview
fun App() {
    MaterialTheme {
        var selectedIndex by remember { mutableStateOf(0) }
        Scaffold(
            bottomBar  = {
                CurvedBottomNavigation(
                    items = navItems,
                    selectedIndex = selectedIndex,
                    showDot = false,
                    enableFabIconScale = true,
                    enableHapticFeedback = false
                ) { index ->
                    selectedIndex = index
                    
                }
            }
        ) {
            SampleScreens(currentIndex = selectedIndex)
        }
    }
}