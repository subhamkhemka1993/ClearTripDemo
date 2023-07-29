package com.sk.cleartripdemoapplication.data.network

import com.sk.cleartripdemoapplication.data.ProductListingDto
import com.sk.cleartripdemoapplication.data.ProductListingDtoItem
import okhttp3.ResponseBody
import retrofit2.http.GET

interface ApiService {

    @GET("products")
    suspend fun getProducts(): List<ProductListingDtoItem>
}