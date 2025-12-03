package io.jadu.sample.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navHostController: NavHostController) {
    ScreenTemplate(
        title = "Home",
        backgroundColor = Color(0xFFFDEFD5),
        navController = navHostController,
        showBackButton = false
    )
}

@Composable
fun TasksScreen(navHostController: NavHostController) {
    ScreenTemplate(
        title = "Search",
        backgroundColor = Color(0xFFE3F2FD),
        navController = navHostController
    )
}

@Composable
fun AddScreen(navHostController: NavHostController) {
    ScreenTemplate(
        title = "Moments",
        backgroundColor = Color(0xFFF3E5F5),
        navController = navHostController
    )
}

@Composable
fun CalendarScreen(navHostController: NavHostController) {
    ScreenTemplate(
        title = "Friends",
        backgroundColor = Color(0xFFE8F5E9),
        navController = navHostController
    )
}

@Composable
fun SettingsScreen(navHostController: NavHostController) {
    ScreenTemplate(
        title = "Profile",
        backgroundColor = Color(0xFFFFF3E0),
        navController = navHostController
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ScreenTemplate(
    title: String,
    backgroundColor: Color,
    navController: NavHostController,
    showBackButton: Boolean = true
) {
    Scaffold(
        topBar = {
            if (showBackButton) {
                TopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors().copy(
                        containerColor = backgroundColor
                    ),
                    title = { Text(title) },
                    navigationIcon = {
                        IconButton(onClick = { navController.navigateUp() }) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back"
                            )
                        }
                    }
                )
            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(backgroundColor)
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = title,
                    fontSize = 72.sp,
                    fontWeight = FontWeight.Black,
                    color = Color.Black
                )
            }
        }
    }
}


