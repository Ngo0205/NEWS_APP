package com.example.newsapp.ui.repository

import androidx.room.Query
import com.example.newsapp.ui.api.RetrofitIntance
import com.example.newsapp.ui.db.ArticleDatabase

class NewsRepository(
    val db : ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitIntance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String,pageNumber: Int) =
        RetrofitIntance.api.searchForNews(searchQuery,pageNumber)

}