package com.developerdan.cocktailapp.models.data.remote.cocktailDto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Drink(
    @Json(name = "idDrink")
    val idDrink: Int,
    @Json(name = "strDrink")
    val strDrink: String,
    @Json(name = "strDrinkThumb")
    val strDrinkThumb: String
)