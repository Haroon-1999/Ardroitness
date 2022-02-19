package com.example.ardroitness.dataSource

import com.example.ardroitness.Art.Art
import com.example.ardroitness.R

class DataSource {
    fun loadArt() : List<Art> {
        return listOf<Art>(
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg)
        )
    }

}