package com.example.mviarchitecture.data.api

import com.example.mviarchitecture.data.model.User
import com.example.mviarchitecture.unsplash.Wallpaper
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

    @GET("collections/")
    fun getWallpapers(
        @Query("client_id") clientId : String,
        @Query("query") query : String,
        @Query("page") page : Int,
        @Query("per_page") per_page : Int
    ): Call<Wallpaper>

}