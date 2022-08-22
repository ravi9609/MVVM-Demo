package com.example.mvvmdemo.network

import com.example.mvvmdemo.model.Post
import retrofit2.http.GET

interface ApiService1 {
    @GET("posts")
    suspend fun getPost():List<Post>
}