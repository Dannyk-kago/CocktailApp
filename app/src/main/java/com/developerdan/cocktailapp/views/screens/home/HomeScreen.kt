package com.developerdan.cocktailapp.views.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.developerdan.cocktailapp.view_models.RandomCocktailViewModel
import com.developerdan.cocktailapp.views.ui.theme.ScreensBackground
import com.developerdan.cocktailapp.views.ui.theme.Teal200
import com.developerdan.cocktailapp.R
import com.developerdan.cocktailapp.views.navigation.TopBarNavigation
import com.developerdan.cocktailapp.views.screens.common.DiscoverCocktailItem
import com.developerdan.cocktailapp.views.screens.common.PopularCocktailItem


@Composable
fun HomeScreen(
    viewModel: RandomCocktailViewModel = hiltViewModel()
) {

    val randomCocktailItems by viewModel.state.collectAsState()

    LazyColumn {
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .background(ScreensBackground)
            ) {
                TopBarNavigation(
                    modifier = Modifier
                        .background(Color.Transparent),
                    logoImage = painterResource(id = R.drawable.splash),
                    profileImage = painterResource(id = R.drawable.imge)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
        item {
            //Store Card
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp, horizontal = 8.dp)
                    .height(194.dp),
                shape = RoundedCornerShape(topStart = 30.dp, bottomEnd = 30.dp),
                backgroundColor = Teal200
            ) {
                Row(
                    modifier = Modifier
                        .padding(start = 6.dp, end = 6.dp, bottom = 4.dp)
                        .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            color = Color.Black,
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.SansSerif,
                            text = "What's in your Bar?"
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(
                            modifier = Modifier
                                .wrapContentWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(
                                modifier = Modifier
                                    .padding(start = 10.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Normal,
                                    fontFamily = FontFamily.Serif,
                                    text = "Find your recipe based on"
                                )
                                Text(
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Normal,
                                    fontFamily = FontFamily.Serif,
                                    text = "what you have at home"
                                )
                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Image(
                                painter = painterResource(id = R.drawable.ic_greater_than_icon),
                                modifier = Modifier
                                    .width(20.dp)
                                    .height(40.dp),
                                contentDescription = "Greater than icon"
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Image(
                        painter = painterResource(id = R.drawable.splash),
                        modifier = Modifier
                            .padding(bottom = 15.dp)
                            .fillMaxHeight(),
                        contentDescription = "Splash icon"
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
        item {
            Text(
                text = "Discover",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.height(5.dp))
        }
        item {
            Spacer(modifier = Modifier.height(5.dp))

            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp)
                    .wrapContentHeight(),
                contentAlignment = Alignment.Center
            ) {
                LazyRow {
                    items(randomCocktailItems) { drink ->
                        DiscoverCocktailItem(drink = drink)
                    }
                }
            }
        }
        item {
            Text(
                text = "Popular",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.height(5.dp))
        }
        item {
            Spacer(modifier = Modifier.height(5.dp))

            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, bottom = 10.dp, end = 10.dp)
                    .wrapContentHeight(),
                contentAlignment = Alignment.Center
            ) {
                LazyRow {
                    items(randomCocktailItems) { drink ->
                        PopularCocktailItem(drink = drink)
                    }
                }
            }
            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

