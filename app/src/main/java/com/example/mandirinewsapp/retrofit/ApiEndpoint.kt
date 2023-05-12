package com.example.mandirinewsapp.retrofit
import com.example.mandirinewsapp.MainModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {

    @GET("top-headlines?country=us&apiKey=021ace3736d14238bf03ca118e7105f8")
    fun getData():Call<MainModel>
}