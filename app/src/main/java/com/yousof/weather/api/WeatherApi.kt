package com.yousof.weather.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

@GET("/v1/current.json")
suspend fun getWeather(
    @Query("key") apikey : String,
    @Query("q") city: String,
    @Query("aqi") aqi: String = "no"  // 👈 wichtig, sonst fehlen Daten!

    ): Response<WeatherModel>
}

// suspend fun sagt es kann sein dass man zeit braucht für ausführung
// damit man nicht die app aufhält vcn arbeiten , also die app arbeitet einfach weiteri