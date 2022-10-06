package com.developerdan.cocktailapp.views.screens.common

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.developerdan.cocktailapp.models.data.remote.cocktailDto.Drink
import com.developerdan.cocktailapp.views.screens.common.CircularFavoriteButtons
import com.developerdan.cocktailapp.views.ui.theme.CardBackground
import com.skydoves.landscapist.coil.CoilImage


@Composable
fun DiscoverCocktailItem(
    drink: Drink
) {
    Card(
        modifier = Modifier
            .width(280.dp)
            .wrapContentHeight(),
        shape = RoundedCornerShape(16.dp),
        backgroundColor = CardBackground
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentHeight(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .wrapContentSize()
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
            ) {

                val image = drink.strDrinkThumb

                CoilImage(
                    imageModel = image,

                    modifier = Modifier
                        .height(180.dp)
                        .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = drink.strDrink,
                color = Color.White,
                style = MaterialTheme.typography.subtitle1,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(4.dp))
        }
        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier.padding(10.dp)
        ) {
            CircularFavoriteButtons(
                isLiked = true,
                onClick = {},
            )
        }
    }
    Spacer(modifier = Modifier.width(16.dp))
}