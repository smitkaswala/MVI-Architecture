package com.example.mviarchitecture.data.api


import com.example.mviarchitecture.data.model.User
import com.example.mviarchitecture.unsplash.Wallpaper
import retrofit2.Call

interface ApiHelper {

    suspend fun getUsers(): List<User>

    fun getWallpapers(): Call<Wallpaper>

}