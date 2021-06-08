package com.martin.repositoryexample.data.networking

interface NetworkingClient {
    fun getService(): ApiService
}