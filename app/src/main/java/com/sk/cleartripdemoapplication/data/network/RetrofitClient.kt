package com.sk.cleartripdemoapplication.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitClient {

    companion object {
        private var service: ApiService? = null
        fun getClient(): ApiService {
            return service?.let {
                it
            } ?: run {
                initRetrofit()
                service!!
            }
        }
//'https://fakestoreapi.com/products
        private fun initRetrofit() {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://fakestoreapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            service = retrofit.create(ApiService::class.java)
        }
    }

}


