package com.developerdan.cocktailapp.models.data.remote.cocktailDto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RandomCocktail(
    @Json(name = "drinks")
    val drinks: List<Drink>
)