package com.erickcode.androidfirst.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api/7d8518f254d7954b8d4946dfcffaa1b9/search/{name}")
    suspend fun getSuperHeroes(@Path("name") superHeroName:String): Response<SuperHeroDataResponse>


}