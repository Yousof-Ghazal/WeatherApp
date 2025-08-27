package com.yousof.weather.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Thermostat
import androidx.compose.material.icons.filled.Waves
import androidx.compose.material.icons.outlined.WaterDrop
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.LiveData
import com.yousof.weather.api.WeatherModel

@Composable

fun InformationBar(data: WeatherModel){

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding()
        ){
            Icon(
                Icons.Outlined.WaterDrop,
                contentDescription = "Humidity",
                modifier = Modifier.size(width = 30 .dp, height = 30.dp),
                tint = Color.White
            )
            Text(
                text = "HUMADITY",
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = Color.White
            )
            Text(
                text = "${data.current.humidity}%",
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = Color.White
            )
        }
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding()
        ){
            Icon(
                Icons.Default.Waves,
                contentDescription = "Humidity",
                modifier = Modifier.size(width = 30 .dp, height = 30.dp),
                tint = Color.White
            )
            Text(
                text = "WIND",
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = Color.White
            )
            Text(
                text = "${data.current.wind_kph}km/h",
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = Color.White
            )
        }
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding()
        ){
            Icon(
                Icons.Default.Thermostat,
                contentDescription = "feels like",
                modifier = Modifier.size(width = 30 .dp, height = 30.dp),
                tint = Color.White
            )
            Text(
                text = "FEELS LIKE",
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = Color.White
            )
            Text(
                text = "${data.current.feelslike_c}°",
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = Color.White
            )
        }
    }
}