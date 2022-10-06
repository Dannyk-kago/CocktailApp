package com.developerdan.cocktailapp.views.navigation

import android.graphics.drawable.PaintDrawable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.developerdan.cocktailapp.R
import com.developerdan.cocktailapp.views.ui.theme.Teal200


@Composable
fun MainScreen() {
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
        BottomNavigationItem.HomeScreen,
        BottomNavigationItem.SearchScreen,
        BottomNavigationItem.FavouriteScreen,
        BottomNavigationItem.ShoppingListScreen
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation(
        backgroundColor = White,
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
    screen: BottomNavigationItem,
    currentDestination: NavDestination?,
    navController: NavHostController
){
    BottomNavigationItem(
        icon = { Icon(painterResource(id = screen.icon), contentDescription = screen.title) },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        selectedContentColor = Teal200,
        unselectedContentColor = Color.Black.copy(0.4f),
        onClick =  {
            navController.navigate(screen.route)
        }
    )
}