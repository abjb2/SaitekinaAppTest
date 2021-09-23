package com.example.saitekinaapptest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.saitekinaapptest.fragments.cartFragment
import com.example.saitekinaapptest.fragments.contactFragment
import com.example.saitekinaapptest.fragments.homeFragment
import com.example.saitekinaapptest.fragments.shopFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val homeFragment = homeFragment()
    private val shopFragment = shopFragment()
    private val cartFragment = cartFragment()
    private val contactFragment = contactFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(homeFragment)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {
                R.id.nav_home -> replaceFragment(homeFragment)
                R.id.nav_shop -> replaceFragment(shopFragment)
                R.id.nav_cart -> replaceFragment(cartFragment)
                R.id.nav_contact -> replaceFragment(contactFragment)
            }
            true

        }
    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}