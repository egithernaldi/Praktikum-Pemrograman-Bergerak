package com.example.jobppb.api

import com.example.jobppb.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>

}