package com.example.askmefirst.api

import com.example.askmefirst.model.chat.ChatModel
import com.example.askmefirst.model.imageresponse.GenerateImageModel
import com.example.askmefirst.model.request.ImageGenerateRequest
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInterface {

    @POST("/v1/completions")
    suspend fun getChat(
        @Header("Content-Type") contentType:String,
        @Header("Authorization") authorization:String,
        @Body requestBody: RequestBody

    ):ChatModel

    @POST("/v1/images/generations")
    suspend fun generateImage(

        @Header("Content-Type") contentType:String,
        @Header("Authorization") authorization:String,
        @Body requestBody: RequestBody

    ):GenerateImageModel


}