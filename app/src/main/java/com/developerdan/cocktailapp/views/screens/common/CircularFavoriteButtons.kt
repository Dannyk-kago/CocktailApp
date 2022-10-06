package com.developerdan.cocktailapp.views.screens.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.developerdan.cocktailapp.R
import com.developerdan.cocktailapp.views.ui.theme.Teal200
import kotlin.math.floor

@Composable
fun CircularFavoriteButtons(
    isLiked: Boolean,
    onClick: () -> Unit = {}
) {
    Box(
        modifier = Modifier
            .wrapContentSize()
            .clip(CircleShape)
            .background(Color.LightGray),
    ) {
        IconButton(onClick = {
            onClick()
        }) {
            Icon(
                modifier = Modifier
                    .width(35.dp)
                    .height(35.dp),
                imageVector = Icons.Filled.Favorite,
                tint = if (isLiked) {
                    Teal200
                } else {
                    Color.Black
                },
                contentDescription = if (isLiked) {
                    stringResource(id = R.string.unlike)
                } else {
                    stringResource(id = R.string.like)
                }
            )
        }
    }
}