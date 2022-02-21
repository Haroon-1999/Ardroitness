package com.example.ardroitness.dataSource

import com.example.ardroitness.Art.Art
import com.example.ardroitness.R

class DataSource {
    fun loadGogh() : List<Art> {
        return listOf<Art>(
            Art(R.string.van1, R.drawable.starrynightgogh),
            Art(R.string.van2, R.drawable.sunflowersvangogh),
            Art(R.string.van3, R.drawable.potatoeatersvangogh),
            Art(R.string.van4, R.drawable.wornoutvangogh)
        )
    }
    fun loadDali() : List<Art> {
        return listOf<Art>(
            Art(R.string.dali1, R.drawable.dali_persistence_of_memory),
            Art(R.string.dali2, R.drawable.dali_great_masturbator),
            Art(R.string.dali3, R.drawable.dali_burning_giraffe),
            Art(R.string.dali4, R.drawable.dali_temptation_of_anthony)
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
            Art(R.string.nara1, R.drawable.midnight_truth_nara),
            Art(R.string.nara2, R.drawable.sleepless_night_sitting_nara),
            Art(R.string.nara3, R.drawable.girl_with_knife_nara),
            Art(R.string.nara4, R.drawable.a_to_z_memorial_dog)
        )
    }

}