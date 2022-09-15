package com.developerdan.cocktailapp.views.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.developerdan.cocktailapp.views.screens.FavouriteScreen
import com.developerdan.cocktailapp.views.screens.HomeScreen
import com.developerdan.cocktailapp.views.screens.SearchScreen
import com.developerdan.cocktailapp.views.screens.ShoppingListScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Search.route) {
            SearchScreen()
        }
        composable(route = BottomBarScreen.Favourite.route) {
            FavouriteScreen()
        }
        composable(route = BottomBarScreen.ShoppingList.route) {
            ShoppingListScreen()
        }

    }
}