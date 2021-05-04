package com.example.mykotlinapplication2

import retrofit2.Retrofit
import retrofit2.http.GET

interface SimpleApi {

    @GET("posts/1")
    suspend fun getPost() : Post
}