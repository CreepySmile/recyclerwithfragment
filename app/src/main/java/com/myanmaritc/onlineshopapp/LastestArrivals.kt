package com.myanmaritc.onlineshopapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmaritc.themarket.ProductAdapter
import kotlinx.android.synthetic.main.fragment_lastest_arrivals.*


class LastestArrivals : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val productList = ArrayList<Product>()
        productList.add(Product(R.drawable.sugar,"Fine Grain Sugar", 30.0,50))
        productList.add(Product(R.drawable.peanuts,"Peanuts", 60.0,25))
        productList.add(Product(R.drawable.rice,"Rice", 120.0,175))

        recycler_view.adapter = ProductAdapter(productList)
        recycler_view.layoutManager = LinearLayoutManager(context)
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lastest_arrivals, container, false)
    }

}