package io.jadu.animatedBottomBar.models

import androidx.compose.ui.graphics.vector.ImageVector

/* Customize this to use Res drawables for CMP */
data class NavItem(
    val icon: ImageVector,
    val selectedIcon: ImageVector? = null,
    val label: String,
    val route: String,
    val badgeCount: Int? = null
)