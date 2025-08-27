package com.yousof.weather.Screen

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.NavController
import com.yousof.weather.ViewModel.WeatherViewModel
import com.yousof.weather.api.NetworkResponse

@Composable
fun WeatherDetailScreen(viewModel: WeatherViewModel, navController: NavController) {
    val result = viewModel.weatherResult.observeAsState()

    when (val weather = result.value) {
        is NetworkResponse.Success -> {
            // Daten vorhanden → an UI weitergeben
            WeatherDetails(data = weather.data)
        }
        is NetworkResponse.Error -> Text("Fehler: ${weather.message}")
        NetworkResponse.Loading -> CircularProgressIndicator()
        null -> Text("Keine Daten verfügbar.")
    }
}
