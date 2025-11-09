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
import io.jadu.animatedBottomBar.models.IconSource
import io.jadu.animatedBottomBar.models.NavItem

val navItems = listOf(
    NavItem(
        icon = IconSource.Vector(Icons.Outlined.Home),
        selectedIcon = IconSource.Vector(Icons.Filled.Home),
        label = "Home",
        route = "home"
    ),
    NavItem(
        icon = IconSource.Vector(Icons.Outlined.Search),
        selectedIcon = IconSource.Vector(Icons.Filled.Search),
        label = "Search",
        route = "search"
    ),
    NavItem(
        icon = IconSource.Vector(Icons.Outlined.Camera),
        selectedIcon = IconSource.Vector(Icons.Filled.Camera),
        label = "Moments",
        route = "favorites",
        badgeCount = 5
    ),
    NavItem(
        icon = IconSource.Vector(Icons.Outlined.SentimentVerySatisfied),
        selectedIcon = IconSource.Vector(Icons.Filled.SentimentVerySatisfied),
        label = "Friends",
        route = "savedFriends"
    ),
    NavItem(
        icon = IconSource.Vector(Icons.Outlined.Person4),
        selectedIcon = IconSource.Vector(Icons.Filled.Person4),
        label = "Person",
        route = "person",
        badgeCount = 5
    ),
)