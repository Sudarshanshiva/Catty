package com.example.catty.data.network

import com.example.catty.CatFactResponse
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface CatFactService {
 @GET("fact")
 suspend fun getAFact():CatFactResponse
}
val contentType = "application/json".toMediaType()
private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl("https://catfact.ninja/")
    .build()

object NetworkService{
  val service: CatFactService by lazy {
   retrofit.create(CatFactService::class.java)
  }
}