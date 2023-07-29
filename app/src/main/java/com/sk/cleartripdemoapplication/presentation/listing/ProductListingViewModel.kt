package com.sk.cleartripdemoapplication.presentation.listing

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sk.cleartripdemoapplication.data.network.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProductListingViewModel : ViewModel() {


    fun fetchProducts() {
        viewModelScope.launch(Dispatchers.IO) {
            val client = RetrofitClient.getClient()
            val products = client.getProducts()
            Log.d("Products", "$products")
        }
    }

}