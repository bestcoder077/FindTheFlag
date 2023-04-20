package com.example.flagapp.view.data

import com.example.flagapp.view.model.ModelContinent

class MockData {
    companion object {
        fun getContinents(): MutableList<ModelContinent> {
            return mutableListOf(
                ModelContinent("All continents"),
                ModelContinent("Europe"),
                ModelContinent("Asia"),
                ModelContinent("North America"),
                ModelContinent("South America")
            )
        }
    }
}