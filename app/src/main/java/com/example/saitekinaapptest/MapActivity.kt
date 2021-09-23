package com.example.saitekinaapptest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import kotlinx.android.synthetic.main.activity_map.*

class MapActivity : AppCompatActivity(), OnMapReadyCallback  {
        private lateinit var googleMap: GoogleMap

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            map_view.onCreate(savedInstanceState)
            map_view.onResume()

            map_view.getMapAsync(this)
        }

        override fun onMapReady(map: GoogleMap?) {
            map?.let{
                googleMap = it
            }
        }
    }
