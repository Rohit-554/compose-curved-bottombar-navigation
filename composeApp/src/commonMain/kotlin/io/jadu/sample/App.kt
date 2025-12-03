package io.jadu.sample

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import io.jadu.animatedBottomBar.CurvedBottomNavigation
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    //SimpleExample()

    /* Check the code for NavStack handling */
    MainScreen()
}

@Composable
fun SimpleExample() {
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