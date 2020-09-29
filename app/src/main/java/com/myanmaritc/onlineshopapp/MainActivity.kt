package com.myanmaritc.onlineshopapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val latestArrivalsFragment = LastestArrivals()
        fragmentTransaction.add(R.id.lastest_arrivals_fragment, latestArrivalsFragment)
        fragmentTransaction.commit()

        val popularProductFragment = PopularProduct()
        fragmentTransaction.add(R.id.popular_product_fragment, popularProductFragment)
        fragmentTransaction.commit()

    }
}