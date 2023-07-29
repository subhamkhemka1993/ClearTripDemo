package com.sk.cleartripdemoapplication.presentation.listing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.sk.cleartripdemoapplication.databinding.FragmentProductListingBinding

class ProductListingFragment: Fragment() {

    private var binding: FragmentProductListingBinding? = null

    private val productListingViewModel: ProductListingViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentProductListingBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()

        productListingViewModel.fetchProducts()

    }

    private fun initRecycler() {
        binding?.recylerView?.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ProductListingAdapter()
        }
    }

}