package com.developerdan.cocktailapp.views.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.developerdan.cocktailapp.views.screens.favourite.FavouriteScreen
import com.developerdan.cocktailapp.views.screens.home.HomeScreen
import com.developerdan.cocktailapp.views.screens.search.SearchScreen
import com.developerdan.cocktailapp.views.screens.shopping.ShoppingListScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomNavigationItem.HomeScreen.route
    ) {
        composable(BottomNavigationItem.HomeScreen.route) {
            HomeScreen()
        }
        composable(BottomNavigationItem.SearchScreen.route) {
            SearchScreen()
        }
        composable(BottomNavigationItem.FavouriteScreen.route) {
            FavouriteScreen()
        }
        composable(BottomNavigationItem.ShoppingListScreen.route) {
            ShoppingListScreen()
        }

    }
}