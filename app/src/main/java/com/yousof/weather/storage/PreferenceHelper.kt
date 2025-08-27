package com.yousof.weather.storage

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.yousof.weather.api.WeatherModel


//Du hast eine Hilfsklasse geschrieben, die dir das Speichern und Laden erleichtert.

object PreferenceHelper {
    private const val PREF_NAME = "weather_prefs"

    fun saveWeather(context: Context,city: String, data: WeatherModel) {

      val prefs: SharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

        val json = Gson().toJson(data)
        val key = "weather_data_${city.lowercase()}"
        prefs.edit().putString(key, json).apply()

    }
    fun loadWeather(context: Context, city: String): WeatherModel? {
        val prefs: SharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        val key = "weather_data_${city.lowercase()}"
        val json = prefs.getString(key, null)
        return if (json != null) {
            Gson().fromJson(json, WeatherModel::class.java)
        } else null
    }
}

