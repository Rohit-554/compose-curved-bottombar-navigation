package io.jadu.sample

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Camera
import androidx.compose.material.icons.filled.CloudSync
import androidx.compose.material.icons.filled.Gamepad
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person2
import androidx.compose.material.icons.filled.Person4
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.SentimentVerySatisfied
import androidx.compose.material.icons.outlined.Camera
import androidx.compose.material.icons.outlined.CloudSync
import androidx.compose.material.icons.outlined.Gamepad
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Person3
import androidx.compose.material.icons.outlined.Person4
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.SentimentVerySatisfied
import io.jadu.animatedBottomBar.models.NavItem

val navItems = listOf(
    NavItem(
        icon = Icons.Outlined.Home,
        selectedIcon = Icons.Filled.Home,
        label = "Home",
        route = "home"
    ),
    NavItem(
        icon = Icons.Outlined.Search,
        selectedIcon = Icons.Filled.Search,
        label = "Search",
        route = "search"
    ),
    NavItem(
        icon = Icons.Outlined.Camera,
        selectedIcon = Icons.Filled.Camera,
        label = "Moments",
        route = "favorites",
        badgeCount = 5  // Show "5" badge
    ),
    NavItem(
        icon = Icons.Outlined.SentimentVerySatisfied,
        selectedIcon = Icons.Filled.SentimentVerySatisfied,
        label = "Friends",
        route = "savedFriends"
    ),
    NavItem(
        icon = Icons.Outlined.Person4,
        selectedIcon = Icons.Filled.Person4,
        label = "Person",
        route = "person",
        badgeCount = 5  // Show "5" badge
    ),
)