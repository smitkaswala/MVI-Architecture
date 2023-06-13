package com.example.mviarchitecture.data.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mviarchitecture.MainIntent
import com.example.mviarchitecture.MainState
import com.example.mviarchitecture.data.repository.MainRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class MainViewModel(private val repository: MainRepository) : ViewModel() {

    val userIntent = Channel<MainIntent>(Channel.UNLIMITED)
    val wallpaperIntent = Channel<MainIntent>(Channel.UNLIMITED)
    private val state_ = MutableStateFlow<MainState>(MainState.Idle)
    val state: StateFlow<MainState> get() = state_

    init {
        handleIntent()
    }

    private fun handleIntent() {
        viewModelScope.launch {
            /*userIntent.consumeAsFlow().collect {
                when (it) {
                    is MainIntent.FetchUser -> fetchUser()
                    else -> {}
                }
            }*/

            wallpaperIntent.consumeAsFlow().collect {
                when (it) {
                    is MainIntent.FetchWallpaper -> fetchWallpaper()
                    else -> {}
                }
            }
        }
    }

    private fun fetchUser() {
        viewModelScope.launch {
            state_.value = MainState.Loading
            state_.value = try {
                MainState.Users(repository.getUser())
            } catch (e: Exception) {
                MainState.Error(e.localizedMessage)
            }
        }
    }

    private fun fetchWallpaper() {
        viewModelScope.launch {
            state_.value = MainState.Loading
            state_.value = try {
                MainState.WallPaper(repository.getWallpapers())
            } catch (e: Exception) {
                MainState.Error(e.localizedMessage)
            }
        }
    }

}