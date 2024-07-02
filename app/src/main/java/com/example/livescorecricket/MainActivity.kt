package com.example.livescorecricket

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.livescorecricket.API.RetrofitInstance
import com.example.livescorecricket.Adapter.CrciketAdapter
import com.example.livescorecricket.Model.CricketData
import com.example.livescorecricket.Model.Data
import com.example.livescorecricket.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: CrciketAdapter
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)


    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        RetrofitInstance.api.getLiveScore("5b1ffa32-dbc9-4e16-9f38-9b348da95699").enqueue(object : Callback<CricketData?> {
            override fun onResponse(call: Call<CricketData?>, response: Response<CricketData?>) {

                if(response.isSuccessful)
                {
                  adapter = CrciketAdapter(response.body()!!.data as ArrayList<Data>)
                    binding.recyclerView.adapter = adapter
                }
            }

            override fun onFailure(call: Call<CricketData?>, t: Throwable) {

            }
        })

    }
}

// to call object ctrl + shift+ space
//5b1ffa32-dbc9-4e16-9f38-9b348da95699