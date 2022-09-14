package com.developerdan.cocktailapp.views.screens

import com.developerdan.cocktailapp.R

sealed class BottomBarScreen (
    var route:String,
    var title:String,
    var icon: Int
) {
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.ic_glass_icon
    )

    object Search : BottomBarScreen(
        route = "search",
        title = "Search",
        icon = R.drawable.ic_search_icon
    )

    object Post : BottomBarScreen(
        route = "post",
        title = "Post",
        icon = R.drawable.ic_heart_icon
    )

    object Favorite : BottomBarScreen(
        route = "favorite",
        title = "Favorite",
        icon = R.drawable.ic_bag_shopping_icon
    )

}