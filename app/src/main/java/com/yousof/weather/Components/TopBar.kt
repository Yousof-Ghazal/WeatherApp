package com.yousof.weather.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yousof.weather.api.WeatherModel

@Composable

fun TopBar(    data: WeatherModel
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 52.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Default.LocationOn,
                contentDescription = "",
                modifier = Modifier.size(31.dp),
                tint = Color.White
            )
            Text(
                text = data.location.name,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                color = Color.White
            )
        }
        Icon(
            Icons.Default.Menu,
            contentDescription = "",
            modifier = Modifier.size(32.dp),
                    tint = Color.White

        )
    }
}