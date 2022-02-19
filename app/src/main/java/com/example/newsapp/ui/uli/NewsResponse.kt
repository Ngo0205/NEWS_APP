package com.example.newsapp.ui.uli

import com.example.newsapp.ui.uli.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)