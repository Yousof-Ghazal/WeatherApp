package com.yousof.weather.ViewModel

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yousof.weather.Screen.WeatherDetailScreen
import com.yousof.weather.Screen.WeatherSearch

@Composable
fun WeatherApp (viewModel: WeatherViewModel) {

    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = "WeatherDetails"
    ) {
        composable("WeatherDetails") {
            WeatherSearch(viewModel = viewModel, navController = navController)
        }
        composable("details") {
            WeatherDetailScreen(viewModel = viewModel, navController = navController)
        }
    }
}