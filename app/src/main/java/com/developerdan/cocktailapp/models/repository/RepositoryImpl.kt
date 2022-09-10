package com.developerdan.cocktailapp.models.repository

import com.developerdan.cocktailapp.models.data.remote.CocktailApi
import com.developerdan.cocktailapp.models.data.remote.cocktailDto.Drink

class RepositoryImpl(
    private val cocktailApi: CocktailApi
): RepositoryDef {

    override suspend fun randomCocktail(): List<Drink> {
        return cocktailApi.getRandomCocktail().drinks
    }

}