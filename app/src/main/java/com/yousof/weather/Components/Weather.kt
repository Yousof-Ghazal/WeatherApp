package com.yousof.weather.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yousof.weather.R
import com.yousof.weather.api.WeatherModel

@Composable

fun Weather (  data: WeatherModel) {

    Box (
        modifier = Modifier.fillMaxWidth()
    ){
        Box(
            modifier = Modifier
                .size(95.dp)
                .align(Alignment.Center)
        ){
            Image(
                painterResource(id = R.drawable.sun),
                contentDescription = "sunny",
                modifier = Modifier.fillMaxSize(),
            )
        }
    }
    Row  (
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
    )
    {
        Text(
            text = data.current.condition.text,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = Color.White
        )
    }
    Row  (
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
    )
    {
        Text(
            text = data.current.temp_c,
            fontWeight = FontWeight.Medium,
            fontSize = 86.sp,
            color = Color.White,
        )
        Text(
            text = "°c",
            fontWeight = FontWeight.Medium,
            fontSize = 30.sp,
            color = Color.White,
        )
    }

}