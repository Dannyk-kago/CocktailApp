package com.developerdan.cocktailapp.views.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.developerdan.cocktailapp.view_models.RandomCocktailViewModel

@Composable
fun HomeScreen() {

    val randomCocktailViewModel = viewModel(modelClass = RandomCocktailViewModel::class.java)
    val randomCocktailItems by randomCocktailViewModel.state.collectAsState()


    LazyColumn() {
        items(randomCocktailItems) { drink ->
            CocktailItem(drink = drink)
        }
    }

}