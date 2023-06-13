package com.example.mviarchitecture.data.repository

import com.example.mviarchitecture.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUser() = apiHelper.getUsers()

    fun getWallpapers() = apiHelper.getWallpapers()

}