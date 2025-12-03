package io.jadu.sample

/* Modified by Rohit, Wed DEC 3 2025 , 09:23 PM IST */
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.jadu.animatedBottomBar.CurvedBottomNavigation
import io.jadu.animatedBottomBar.models.CurveAnimationType
import io.jadu.sample.screens.AddScreen
import io.jadu.sample.screens.CalendarScreen
import io.jadu.sample.screens.HomeScreen
import io.jadu.sample.screens.SettingsScreen
import io.jadu.sample.screens.TasksScreen

@Composable
fun MainScreen(
    navController: NavHostController = rememberNavController()
) {

    /* use NavRoute Sealed class, change `NavItem` to use NavRoute not String */
    val bottomNavItems = remember { navItems }

    /* These three vals are for navbackstack handle */

    val currentBackStackEntry by navController.currentBackStackEntryFlow
        .collectAsState(initial = navController.currentBackStackEntry)      // get the stack flow

    val currentRoute = currentBackStackEntry?.destination?.route    // current route

    val selectedIndex = bottomNavItems.indexOfFirst { item ->
        currentRoute?.contains(item.route) == true      // if using NavRoute, use currentRoute?.contains(item.route::class.simpleName ?: "") == true
    }.coerceAtLeast(0)

    Surface(
        modifier = Modifier.fillMaxSize().navigationBarsPadding(),  // give navigationBars Safe padding
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            NavHost(
                navController = navController,
                startDestination = "home",          // replace with NavRoute.Home if using NavRoute
                modifier = Modifier.fillMaxSize()
            ) {
                composable("home") {
                    HomeScreen(navController)
                }

                composable("search") {
                    TasksScreen(navController)
                }

                composable("favorites") {
                    AddScreen(navController)
                }

                composable("savedFriends") {
                    CalendarScreen(navController)
                }

                composable("person") {
                    SettingsScreen(navController)
                }
            }

            CurvedBottomNavigation(
                modifier = Modifier.align(Alignment.BottomCenter),
                items = bottomNavItems,
                selectedIndex = selectedIndex,
                onItemSelected = { index ->
                    val selectedRoute = bottomNavItems[index].route

                    // Reset the backstack once users comes to home page
                    if (index == 0) {
                        navController.navigate("home") {
                            popUpTo(0) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                        return@CurvedBottomNavigation
                    }

                    if (index != selectedIndex) {
                        navController.navigate(selectedRoute) {
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },
                curveAnimationType = CurveAnimationType.SMOOTH,
                enableHapticFeedback = true,
                showLabels = true,
                navBarBackgroundColor = Color(0xFFFFFFFF),      // Replace with your colors
                unselectedIconTint = Color(0xFF6200EE),
            )
        }
    }
}

