package com.developerdan.cocktailapp.views.screens.search

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import com.developerdan.cocktailapp.R
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.developerdan.cocktailapp.views.ui.theme.Teal200
import com.developerdan.cocktailapp.views.ui.theme.anon
import com.developerdan.cocktailapp.views.ui.theme.veiledSpotlight
import com.developerdan.cocktailapp.views.ui.theme.white


@Composable
fun SearchScreen() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp))
            .background(Teal200),
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
        ) {
            var text by remember { mutableStateOf("") }
            Text(
                text = "Search",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Default,
            )
            Text(
                text = "Search for any ingredients or cocktail",
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Default
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                TextField(
                    modifier = Modifier
                        .weight(0.85f),
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = white,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    ),
                    value = text,
                    shape = RoundedCornerShape(12.dp),
                    singleLine = true,
                    onValueChange = { text = it },
                    placeholder = {
                        Text(
                            text = stringResource(R.string.text_search),
                            color = veiledSpotlight,
                            fontSize = 16.sp
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = stringResource(R.string.text_search_icon),
                            tint = anon
                        )
                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = stringResource(R.string.text_search_icon),
                            tint = anon
                        )
                    },
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
@Preview(showBackground = true)
@Composable
fun SearchScreenPreview() {
    SearchScreen()
}