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
            Art(R.string.guernica, R.drawable.guernica),
            Art(R.string.weeping_woman, R.drawable.weeping_woman),
            Art(R.string.guitarist, R.drawable.guitarist),
            Art(R.string.self_portrait, R.drawable.self_portrait)
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