package com.developerdan.cocktailapp.models.data.remote

import com.developerdan.cocktailapp.models.data.remote.cocktailDto.RandomCocktail
import com.developerdan.cocktailapp.util.Constants
import retrofit2.http.GET

interface CocktailApi {

    //Get Random cocktail
    @GET(Constants.RANDOM)
    suspend fun getRandomCocktail(): RandomCocktail

}