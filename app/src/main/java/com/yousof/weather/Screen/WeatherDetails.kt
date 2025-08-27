package com.yousof.weather.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yousof.weather.Components.DayItem
import com.yousof.weather.Components.InformationBar
import com.yousof.weather.Components.Time
import com.yousof.weather.Components.TopBar
import com.yousof.weather.Components.Weather
import com.yousof.weather.R
import com.yousof.weather.api.WeatherModel

@Composable

fun WeatherDetails (
    data: WeatherModel

){

    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            painterResource(id = R.drawable.eiffel),
            contentDescription = "Paris",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            colorFilter = ColorFilter.tint(Color.Black.copy(alpha = 0.4f), blendMode = BlendMode.Darken)
        )
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
        ){
            TopBar(data)
            Spacer(modifier = Modifier.height(61.dp))
            Time(data)
            Spacer(modifier = Modifier.height(30.dp))
            Weather(data)
            Spacer(modifier = Modifier.height(62.dp))
            InformationBar(data)
            Spacer(modifier = Modifier.height(18.dp))
            Box  (
                modifier = Modifier.fillMaxWidth().background(
                    color = Color.Black.copy(0.6f),
                    shape = RoundedCornerShape(24.dp))
            ) {
                Row (
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier.fillMaxWidth()
                ){
                    DayItem("Wed 16", R.drawable.group_52 , "22", "1-5 km/h")
                    DayItem("Thu 17", R.drawable.sunny, "25", "1-5 km/h")
                    DayItem("Fri 18", R.drawable.sunny, "23", "5 -10 km/h")
                    DayItem("Sat 19", R.drawable.rainy, "25", "1-5 km/h")
                }
            }
        }
    }
}

@Preview
@Composable
fun parisPrev() {

}