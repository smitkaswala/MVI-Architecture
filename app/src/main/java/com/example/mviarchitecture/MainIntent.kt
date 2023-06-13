package com.example.mviarchitecture

sealed class MainIntent {

    object FetchUser : MainIntent()

    object FetchWallpaper : MainIntent()

}