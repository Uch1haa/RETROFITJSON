package com.uche.retrofitapplication.api

import com.uche.retrofitapplication.model.User
import retrofit2.Call
import retrofit2.http.GET

interface PlaceHolderAPI {
    @GET("users")
    fun getUsers(): Call<List<User>>
}