package com.yousof.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.lifecycle.ViewModelProvider

import com.yousof.weather.ViewModel.WeatherApp
import com.yousof.weather.ViewModel.WeatherViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val weatherViewModel = ViewModelProvider(this)[WeatherViewModel :: class.java]

        enableEdgeToEdge()
        setContent {

            WeatherApp(viewModel = weatherViewModel)
            


        }
    }
}
