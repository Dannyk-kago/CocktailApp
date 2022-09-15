package com.developerdan.cocktailapp.views.navigation

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.developerdan.cocktailapp.R
import com.developerdan.cocktailapp.views.screens.HomeScreen

@Composable
fun MainNavigationScreen() {

    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomBar(navController = navController)}
    ) {
        BottomNavGraph(navController = navController)
    }
}

@Composable
fun BottomBar (navController: NavHostController) {
    val screens = listOf (
        BottomBarScreen.Home,
        BottomBarScreen.Search,
        BottomBarScreen.Favourite,
        BottomBarScreen.ShoppingList
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation(
        backgroundColor = colorResource(id = R.color.white),
        contentColor = Color.Black
    ) {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController)
        }
    }
}


@Composable
fun RowScope.AddItem (
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
){
    BottomNavigationItem(
        icon = { Icon(painterResource(id = screen.icon), contentDescription = "") },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        selectedContentColor = Color(0xFF71F9FF),
        unselectedContentColor = Color.Black.copy(0.4f),
        onClick =  {
            navController.navigate(screen.route)
        }
    )
}