package com.poorna.googlemapswithfragments

class Country {

    var country: String
    var city: String

    constructor(country: String, city: String) {
        this.country = country
        this.city = city
    }
}

class CountryProvider {
    companion object {
        fun getCountries(): ArrayList<Country> {
            val countries = ArrayList<Country>()
            countries.add(Country("Australia", "Melbourne"))
            countries.add(Country("Australia", "Sydney"))
            countries.add(Country("Australia", "New Soth Wales"))
            countries.add(Country("Australia", "Box Hill"))
            countries.add(Country("Australia", "Richmond"))
            countries.add(Country("Australia", "Burwood"))
            return countries
        }
    }
}