package com.example.ardroitness.dataSource

import com.example.ardroitness.Art.Art
import com.example.ardroitness.R

class DataSource {
    fun loadGogh() : List<Art> {
        return listOf<Art>(
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg)
        )
    }
    fun loadDali() : List<Art> {
        return listOf<Art>(
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg)
        )
    }
    fun loadPicasso() : List<Art> {
        return listOf<Art>(
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg)
        )
    }
    fun loadNara() : List<Art> {
        return listOf<Art>(
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg),
            Art(R.string.test, R.drawable.testimg)
        )
    }

}