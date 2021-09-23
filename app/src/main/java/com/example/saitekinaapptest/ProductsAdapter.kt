package com.example.saitekinaapptest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.saitekinaapptest.model.product
import kotlinx.android.synthetic.main.product_row.view.*


class ProductsAdapter(private val products: ArrayList<product>): RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.textView_title.text = products[position].title
        holder.itemView.textView_price.text = products[position].price.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = products.size

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    }
}