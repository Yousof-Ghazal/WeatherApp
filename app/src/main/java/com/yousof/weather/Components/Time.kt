package com.yousof.weather.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yousof.weather.api.WeatherModel

@Composable

fun Time(  data: WeatherModel){

    Row  (
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
    )
    {
        Text(
            text = "july 8",
            fontWeight = FontWeight.Medium,
            fontSize = 40.sp,
            color = Color.White
        )
    }
    Spacer(modifier = Modifier.height(9.dp))
    Row  (
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
    )
    {
        Text(
            text = data.current.last_updated ,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            color = Color.White
        )
    }
}