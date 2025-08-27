package com.yousof.weather.ViewModel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yousof.weather.api.Constant
import com.yousof.weather.api.NetworkResponse
import com.yousof.weather.api.RetrofitObject
import com.yousof.weather.api.WeatherModel
import com.yousof.weather.storage.PreferenceHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class WeatherViewModel: ViewModel() {

    private val weatherApi = RetrofitObject.weatherApi
    private val _weatherResult = MutableLiveData<NetworkResponse<WeatherModel>>()
    val weatherResult: LiveData<NetworkResponse<WeatherModel>> = _weatherResult
    fun getData(context: Context, city: String) {
        _weatherResult.value = NetworkResponse.Loading
        viewModelScope.launch {
            try {
                val response =   withContext(Dispatchers.IO){
                weatherApi.getWeather(Constant.apiKey, city)
            }
                if (response.isSuccessful) {
                    response.body()?.let {

                        _weatherResult.value = NetworkResponse.Success(it)
                        PreferenceHelper.saveWeather(context,city, it)
                    }
                } else {
                    loadCached(context, city)
                }
            } catch (e: Exception) {//Kein Internet → versuche lokale Daten
                loadCached(context, city)
            }
        }
        println("Hallo")
    }


    private fun loadCached(context: Context, city: String) {

        viewModelScope.launch {

            val cached = withContext(Dispatchers.IO){
              PreferenceHelper.loadWeather(
                    context,
                    city
                )
            }
            if (cached != null) {

                _weatherResult.value = NetworkResponse.Success(cached)
            } else {
                _weatherResult.value =
                    NetworkResponse.Error("No data found for \"$city\" .")
            }
        }
    }
}