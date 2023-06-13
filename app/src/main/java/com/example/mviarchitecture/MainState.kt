package com.example.mviarchitecture

import com.example.mviarchitecture.data.model.User
import com.example.mviarchitecture.unsplash.Wallpaper
import retrofit2.Call

sealed class MainState {

    object Idle : MainState()
    object Loading : MainState()
    data class Users(val user: List<User>) : MainState()
    data class WallPaper(val wallpaper:Call<Wallpaper>) : MainState()
    data class Error(val error: String?) : MainState()

}