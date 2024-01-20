package com.example.askmefirst.model.request

data class ImageGenerateRequest(
    val n: Int,
    val prompt: String,
    val size: String

)