package com.martin.repositoryexample.data.networking

import com.martin.repositoryexample.utils.Configurations
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkingClientImpl: NetworkingClient {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(Configurations.API_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    override fun getService(): ApiService = retrofit.create(ApiService::class.java)
}