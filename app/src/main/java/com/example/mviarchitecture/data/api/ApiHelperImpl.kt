package com.example.mviarchitecture.data.api

import com.example.mviarchitecture.data.model.User
import com.example.mviarchitecture.unsplash.Wallpaper
import retrofit2.Call

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }

    override fun getWallpapers(): Call<Wallpaper> {
        return apiService.getWallpapers(
            "a82f6bf78409bb9e7f0921a410d9d693d06b98a2d5df9a9cdc8295ab3cb261c1",
            "backdrops",
            1,
            200
        )
    }

}