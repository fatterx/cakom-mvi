package me.lwn.cakom.android.presentation.widget

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import me.lwn.cakom.android.domain.model.Screen
import me.lwn.cakom.android.domain.model.screenItems
import me.lwn.cakom.android.presentation.discovery.ui.Discovery
import me.lwn.cakom.android.presentation.drawer.ui.Drawer
import me.lwn.cakom.android.presentation.profile.ui.Profile

/**
 * Created by fatterx on 2022/4/4
 */
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(topBar = {
        TopAppBar(title = {
            Text("Drawer")
        })
    },
        bottomBar = {
            BottomNavigation {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                screenItems.forEach { screen ->
                    BottomNavigationItem(
                        icon = { Icon(screen.icon, contentDescription = screen.name) },
                        label = { Text(screen.name) },
                        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                        onClick = {
                            navController.navigate(screen.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(navController, startDestination = Screen.Drawer.route, Modifier.padding(innerPadding)) {
            composable(Screen.Profile.route) { Profile(navController) }
            composable(Screen.Drawer.route) { Drawer(navController) }
            composable(Screen.Discovery.route) { Discovery(navController) }
        }
    }
}