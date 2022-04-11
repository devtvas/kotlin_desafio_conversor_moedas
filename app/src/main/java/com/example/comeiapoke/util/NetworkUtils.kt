package com.example.comeiapoke.util

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.security.cert.CertPath

class NetworkUtils {
    companion object {
        fun getRetrofitInstance(path: String) : Retrofit {
    return Retrofit.Builder().baseUrl(path).addConverterFactory(GsonConverterFactory.create()).build()
        }

    }
}