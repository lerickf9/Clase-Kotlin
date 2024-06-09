package com.erickcode.androidfirst.superheroapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.erickcode.androidfirst.R
import com.erickcode.androidfirst.databinding.ActivitySuperHeroListBinding
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SuperHeroListActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySuperHeroListBinding
    private lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuperHeroListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        retrofit = getRetrofit()
        initUI()

    }

//    private fun getInfo(){
    //    https://gateway.marvel.com/v1/public/characters?ts=1&apikey=ac2fde71ec4fa2f0dcd9245812e75366&hash=124d1ddc4155cc9ae5df35d093307474
////        URL url=null
////        private var = namePerson.getText().toString()
//        var urlSearch = HOSTNAME + SERVICE + "ts=" + ts + "&apikey=" +
//            PUBLIC_API_KEY + "&hash=" + HASH + "&name" + name
//        urlSearch = urlSearch.replace("http:", "https:")
//
//    }

    private fun initUI() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchByName(query.orEmpty())
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }


        })
    }

    private fun searchByName(query: String) {

    }


    private fun getRetrofit(): Retrofit {
        return Retrofit
            .Builder()
            .baseUrl("https://gateway.marvel.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}