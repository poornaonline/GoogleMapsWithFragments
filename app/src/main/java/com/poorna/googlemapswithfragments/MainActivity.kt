package com.poorna.googlemapswithfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var googleMapsFragment: GoogleMapsFragment
    private lateinit var cityListFragment: CountryListFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        googleMapsFragment = GoogleMapsFragment()
        cityListFragment = CountryListFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.googleMapsFrameLayout, googleMapsFragment)
            .replace(R.id.cityListFrameLayout, cityListFragment)
            .commit()
    }
}
