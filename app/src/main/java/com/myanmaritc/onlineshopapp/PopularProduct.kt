package com.myanmaritc.onlineshopapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_popular_product.*


class PopularProduct : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val productList2 = ArrayList<Product2>()
        productList2.add(Product2(R.drawable.sugar,"Brown Sugar", 30.0,50))
        productList2.add(Product2(R.drawable.peanuts,"Peanuts Peanuts", 60.0,25))
        productList2.add(Product2(R.drawable.rice,"Rice Rice Rice", 120.0,175))

        recycler_view2.adapter = ProductAdapter(productList2)
        recycler_view2.layoutManager = LinearLayoutManager(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular_product, container, false)
    }

}