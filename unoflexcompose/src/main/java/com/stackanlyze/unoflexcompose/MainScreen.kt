package com.stackanlyze.unoflexcompose

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.stackanlyze.unoflexcompose.screens.*

sealed class BottomBarScreen(
    val title: String,
    val route: String,
    val icon: Int
) {
    data object Rules: BottomBarScreen(
        title = "reglas",
        route = "rules",
        icon = R.drawable.ic_rules
    )

    data object Counter: BottomBarScreen(
        title = "contador",
        route = "counter",
        icon = R.drawable.ic_counter
    )

    data object Colorblind: BottomBarScreen(
        title = "daltonicos",
        route = "colorblind",
        icon = R.drawable.ic_colorblind
    )
}

@Composable
fun BottomNavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController, BottomBarScreen.Rules.route,
        modifier = modifier
    ) {
        composable(BottomBarScreen.Rules.route) { RulesScreen() }
        composable(BottomBarScreen.Counter.route) { CounterScreen() }
        composable(BottomBarScreen.Colorblind.route) { ColorblindScreen() }
    }
}

val screens = listOf(
    BottomBarScreen.Rules,
    BottomBarScreen.Counter,
    BottomBarScreen.Colorblind
)

@Composable
fun BottomBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val currentDestination = navBackStackEntry?.destination

    NavigationBar {
        screens.forEach { screen -> AddItem(screen, currentDestination, navController) }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    val colors = NavigationBarItemDefaults.colors(
        unselectedIconColor = Color(MaterialTheme.colorScheme.onBackground.toArgb()),
        selectedIconColor = Color(MaterialTheme.colorScheme.secondary.toArgb())
    )

    NavigationBarItem(
        icon = { Icon(painterResource(screen.icon), "navigation icon") },
        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
        label = { Text(text = screen.title) },
        colors = colors,
        onClick = {
            navController.navigate(screen.route) {
                launchSingleTop = true
            }
        }
    )
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxHeight(),
        bottomBar = { BottomBar(navController) }
    ) { innerPadding ->
        BottomNavGraph(navController, Modifier.padding(innerPadding))
    }
}
