package com.developerdan.cocktailapp.views.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.developerdan.cocktailapp.models.data.remote.cocktailDto.Drink
import com.skydoves.landscapist.coil.CoilImage


@Composable
fun CocktailItem(
    drink: Drink
) {
    Card(
        modifier = Modifier
            .padding(3.dp)
            .fillMaxWidth(),
        elevation = 16.dp
    ) {
        Row(
            Modifier
                .padding(4.dp)
                .fillMaxSize()
        ) {

            val image = drink.strDrinkThumb
            CoilImage(
                imageModel = image,

                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )


            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxHeight()
                    .weight(0.8f)
            ) {
                Text(
                    text = drink.strDrink,
                    style = MaterialTheme.typography.subtitle1,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text =drink.idDrink,
                    style = MaterialTheme.typography.body1,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

            }
        }
    }
}