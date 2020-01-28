package com.poorna.googlemapswithfragments

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class CountryListFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rv = RecyclerView(activity!!.applicationContext)
        rv.layoutManager = LinearLayoutManager(activity!!.applicationContext)
        val cra = CityRecyclerAdapter()
        rv.adapter = cra

        cra.updateCountries()

        return rv

    }
}
