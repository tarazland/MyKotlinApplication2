package com.example.mykotlinapplication2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object  RetrofitObject {

    private val retrofit:Retrofit?= Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    public fun postConnectionMethod():SimpleApi?{
        return  retrofit?.create(SimpleApi::class.java)
    }

}