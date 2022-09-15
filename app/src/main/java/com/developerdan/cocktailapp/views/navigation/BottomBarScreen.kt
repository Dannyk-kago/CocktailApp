package com.developerdan.cocktailapp.views.navigation

import com.developerdan.cocktailapp.R

sealed class BottomBarScreen (
    var route:String,
    var icon: Int
) {
    object Home : BottomBarScreen(
        route = "home",
        icon = R.drawable.ic_glass_icon
    )

    object Search : BottomBarScreen(
        route = "search",
        icon = R.drawable.ic_search_icon
    )

    object Favourite : BottomBarScreen(
        route = "post",
        icon = R.drawable.ic_heart_icon
    )

    object ShoppingList : BottomBarScreen(
        route = "favorite",
        icon = R.drawable.ic_bag_shopping_icon
    )

}