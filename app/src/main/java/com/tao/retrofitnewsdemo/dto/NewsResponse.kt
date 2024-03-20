package com.tao.retrofitnewsdemo.dto

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)