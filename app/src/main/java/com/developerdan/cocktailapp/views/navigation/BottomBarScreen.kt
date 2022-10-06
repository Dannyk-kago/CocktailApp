package com.developerdan.cocktailapp.views.navigation

import com.developerdan.cocktailapp.R

sealed class BottomNavigationItem (
    val route:String,
    val title: String,
    val icon: Int,
) {
    object HomeScreen : BottomNavigationItem("home","Home" ,icon = R.drawable.ic_glass_icon)

    object SearchScreen : BottomNavigationItem("search","Search" ,icon = R.drawable.ic_search_icon)

    object FavouriteScreen : BottomNavigationItem("post", "Favourite", icon = R.drawable.ic_heart_icon)

    object ShoppingListScreen : BottomNavigationItem("favorite", "Shopping", icon = R.drawable.ic_bag_shopping_icon)

}