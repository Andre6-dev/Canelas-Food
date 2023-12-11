package com.devandre.canelafood.retrofit

import com.devandre.canelafood.pojo.MealList
import retrofit2.Call
import retrofit2.http.GET

interface MealApi {

    @GET("random.php")
    fun getRandomMeal():Call<MealList>
}