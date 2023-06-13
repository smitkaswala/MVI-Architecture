package com.example.mviarchitecture.data.viewmodel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.mviarchitecture.data.api.ApiHelper
import com.example.mviarchitecture.data.repository.MainRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory{

    @OptIn(ExperimentalCoroutinesApi::class)
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}