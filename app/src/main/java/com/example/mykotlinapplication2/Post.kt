package com.example.mykotlinapplication2

import com.google.gson.annotations.SerializedName

 data class Post(
    val title: String,
    @SerializedName("body")
    val bodyField: String
    )
