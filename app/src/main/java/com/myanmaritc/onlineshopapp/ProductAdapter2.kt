package com.myanmaritc.onlineshopapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.product_view2.view.*


class ProductAdapter(private val productList2: ArrayList<Product2>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.imageView2
        val nameView : TextView = itemView.product_name_text2
        val priceView : TextView = itemView.product_price_text2
        val weightView : TextView = itemView.weight_text2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.product_view,parent,false)
        return ProductViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val currentItem = productList2[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.nameView.text = currentItem.productName
        holder.priceView.text = currentItem.productPrice.toString()
        holder.weightView.text = currentItem.productWeight.toString()
    }

    override fun getItemCount(): Int = productList2.size
}