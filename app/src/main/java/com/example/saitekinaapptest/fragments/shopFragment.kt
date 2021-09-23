package com.example.saitekinaapptest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.saitekinaapptest.ProductsAdapter
import com.example.saitekinaapptest.R
import com.example.saitekinaapptest.model.product
import kotlinx.android.synthetic.main.fragment_shop.*

/**
 * A simple [Fragment] subclass.
 */

class shopFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shop, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val products = arrayListOf<product>()

            products.add(product("AFRO BANGLE",R.drawable.shop_afrobangle_1000, 1000.00))
            products.add(product("CANDLE STAND",R.drawable.shop_candlestand1_1000,1500.00))
            products.add(product("DOLPHIN ORNAMENT",R.drawable.shop_dolphine_ornament_750,750.00))
            products.add(product("CANDLE STAND",R.drawable.shop_candlestand2_500,500.00))
            products.add(product("ROCK ORNAMENT",R.drawable.shop_rock_ornament_1000,1000.00))
            products.add(product("JEWEL HOLDER",R.drawable.shop_jewelholder1_750, 750.00))
            products.add(product("EIFFEL TOWER",R.drawable.shop_eiffeltower_1000,1000.00))
            products.add(product("JEWEL HOLDER",R.drawable.shop_jewelholder2_750,750.00))
            products.add(product("CANDLE STAND",R.drawable.shop_candlestand3_1000,1000.00))
            products.add(product("JEWEL HOLDER",R.drawable.shop_jewelholder_glasstray_500,500.00))

        recycler_view_shop.apply {
            if (recycler_view_shop != null) {
                layoutManager = LinearLayoutManager(activity)
                adapter = ProductsAdapter(products)
            }
        }
    }
}