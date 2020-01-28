package com.poorna.googlemapswithfragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_city_item.view.*

class CityRecyclerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var countries = ArrayList<Country>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CityViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.fragment_city_item, parent, false))
    }

    override fun getItemCount(): Int {
        return countries.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is CityViewHolder -> {
                holder.bind(countries.get(position))
            }
        }
    }

    fun updateCountries() {
        countries = CountryProvider.getCountries()
    }
}

class CityViewHolder constructor(itemView: View): RecyclerView.ViewHolder(itemView)  {

    val cityTV: TextView = itemView.cityTextView
    val countryTV: TextView = itemView.countryTextView

    fun bind(country: Country) {
        cityTV.setText(country.city)
        countryTV.setText(country.country)
    }
}