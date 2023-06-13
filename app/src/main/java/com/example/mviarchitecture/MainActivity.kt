package com.example.mviarchitecture

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mviarchitecture.data.api.ApiHelperImpl
import com.example.mviarchitecture.data.api.RetrofitBuilder
import com.example.mviarchitecture.data.viewmodel.MainViewModel
import com.example.mviarchitecture.data.viewmodel.ViewModelFactory
import com.example.mviarchitecture.databinding.ActivityMainBinding
import com.example.mviarchitecture.unsplash.ResultsItem
import com.example.mviarchitecture.unsplash.Wallpaper
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


@ExperimentalCoroutinesApi
class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel
    private var adapter = MainAdapter(arrayListOf())
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
        setupViewModel()
        observeViewModel()
        setupClicks()

    }


    private fun setupClicks() {
        binding.buttonFetchUser.setOnClickListener {
            lifecycleScope.launch {
//                mainViewModel.userIntent.send(MainIntent.FetchUser)
                mainViewModel.wallpaperIntent.send(MainIntent.FetchWallpaper)
            }
        }
    }


    private fun setupUI() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.run {
            addItemDecoration(
                DividerItemDecoration(
                    binding.recyclerView.context,
                    (binding.recyclerView.layoutManager as LinearLayoutManager).orientation
                )
            )
        }
        binding.recyclerView.adapter = adapter
    }


    private fun setupViewModel() {

        mainViewModel = ViewModelProviders.of(
            this@MainActivity,
            ViewModelFactory(
                ApiHelperImpl(
                    RetrofitBuilder.apiService
                )
            )
        )[MainViewModel::class.java]
    }

    private fun observeViewModel() {
        lifecycleScope.launch {
            mainViewModel.state.collect {
                when (it) {
                    is MainState.Idle -> {

                    }

                    is MainState.Loading -> {
                        binding.buttonFetchUser.visibility = View.GONE
                        binding.progressBar.visibility = View.VISIBLE
                    }

                    is MainState.Users -> {
                        binding.progressBar.visibility = View.GONE
                        binding.buttonFetchUser.visibility = View.GONE
                    }

                    is MainState.Error -> {
                        binding.progressBar.visibility = View.GONE
                        binding.buttonFetchUser.visibility = View.VISIBLE
                        Log.e("TAG", "observeViewModel:---- " + it.error)
                        Toast.makeText(this@MainActivity, it.error, Toast.LENGTH_LONG).show()
                    }

                    is MainState.WallPaper -> {

                        it.wallpaper.enqueue(object : Callback<Wallpaper> {
                            override fun onResponse(
                                call: Call<Wallpaper>,
                                response: Response<Wallpaper>
                            ) {
                                val resultsItem = response.body()?.results
                                renderList(resultsItem = resultsItem as List<ResultsItem>)
                                binding.progressBar.visibility = View.GONE
                                binding.buttonFetchUser.visibility = View.GONE
                            }

                            override fun onFailure(call: Call<Wallpaper>, t: Throwable) {

                            }
                        })

                    }
                }
            }
        }
    }

    /*@SuppressLint("NotifyDataSetChanged")
    private fun renderList(users: Wallpaper) {
        binding.recyclerView.visibility = View.VISIBLE
        users.let { listOfUsers -> listOfUsers.let { adapter.addData(it) } }
        adapter.notifyDataSetChanged()
    }*/

    @SuppressLint("NotifyDataSetChanged")
    private fun renderList(resultsItem: List<ResultsItem>) {
        binding.recyclerView.visibility = View.VISIBLE
        resultsItem.let { listOfUsers -> listOfUsers.let { adapter.addData(it) } }
        adapter.notifyDataSetChanged()

    }

}