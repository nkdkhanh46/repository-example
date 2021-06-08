package com.martin.repositoryexample.injection

import com.martin.repositoryexample.data.networking.NetworkingClient
import com.martin.repositoryexample.data.networking.NetworkingClientImpl
import org.koin.dsl.module

val networkingModule = module {
    single<NetworkingClient> { NetworkingClientImpl }
}