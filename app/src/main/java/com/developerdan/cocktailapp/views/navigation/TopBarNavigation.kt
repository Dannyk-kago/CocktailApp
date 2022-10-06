package com.developerdan.cocktailapp.views.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.developerdan.cocktailapp.views.ui.theme.ScreensBackground

@Composable
fun TopBarNavigation(
    modifier: Modifier = Modifier,
    /*navigator: DestinationsNavigator,*/
    showBackArrow: Boolean = false,
    navActions: @Composable RowScope.() -> Unit = {},
    logoImage: Painter,
    profileImage: Painter
) {
    TopAppBar(

        {
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                //Logo Image
                Image(
                    painter = logoImage,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop,
                    contentDescription = "Logo image"
                )
                //profile Image
                Image(
                    painter = profileImage,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop,
                    contentDescription = "profile image"
                )
            }
        },
        actions = navActions,
        backgroundColor = ScreensBackground,
        elevation = 5.dp
    )
}


