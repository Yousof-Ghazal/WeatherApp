package com.yousof.weather.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yousof.weather.R

@Composable

fun DayItem(
    day: String,
    iconRes: Int,
    temperature: String,
    windSpeed: String,

    ){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 19.dp, vertical = 16.dp)
    ){
        Text(text = day, color = Color.White, fontSize = 14.sp)
        Spacer( modifier = Modifier.height(4.dp))
        Box (
            modifier = Modifier.size(width = 41.dp, height = 32.dp),
        ){
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
        }
        Spacer( modifier = Modifier.height(4.dp))
        Text(temperature, color = Color.White , fontSize = 16.sp)
        Text(windSpeed, color = Color.White, style = MaterialTheme.typography.bodySmall, fontSize = 10.sp)
    }
}

@Preview
@Composable
private fun dayitemp() {
    DayItem("Wed 16", R.drawable.partly_cloud, "22", "1-5 km/h")
}