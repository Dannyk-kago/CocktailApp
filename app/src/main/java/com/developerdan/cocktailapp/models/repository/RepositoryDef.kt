package com.developerdan.cocktailapp.models.repository

import com.developerdan.cocktailapp.models.data.remote.cocktailDto.Drink


interface RepositoryDef {

    suspend fun randomCocktail(): List<Drink>
}