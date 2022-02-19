package com.example.newsapp.ui.api

import com.example.newsapp.ui.Constants.Companion.API_KEY
import com.example.newsapp.ui.uli.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

   @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        page: Int = 1,
        @Query("APIKey")
        apikey:String = API_KEY
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery : String = "tesla",
        @Query("page")
        page: Int = 1,
        @Query("APIKey")
        apikey:String = API_KEY
    ): Response<NewsResponse>

}