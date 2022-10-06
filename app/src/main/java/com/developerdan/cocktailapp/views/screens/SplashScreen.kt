package com.developerdan.cocktailapp.views.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.developerdan.cocktailapp.R
import com.developerdan.cocktailapp.views.ui.theme.CocktailAppTheme

@Composable
fun SplashScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
    ){
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp, bottom = 40.dp),
                horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(text = "Cocktail",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive
            )

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.splash),
                contentDescription = "Splash screen Image",
                modifier = Modifier
                    .size(350.dp)
            )

            Spacer(modifier = Modifier.height(70.dp))
            
            Button(onClick = {  },
                modifier = Modifier
                    .width(200.dp)
                    .clip(RoundedCornerShape(15.dp))
                ) {
                Text(text = "Let's Mix",
                    modifier = Modifier
                        .padding(8.dp),
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SplashScreenPreview() {
    CocktailAppTheme {
        SplashScreen()
    }
}
