package com.example.ardroitness

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.ardroitness.Adapter.ItemAdapter
import com.example.ardroitness.Art.Art
import com.example.ardroitness.dataSource.DataSource
import kotlin.random.Random

class RandomPage : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_gallery)

        val numberOfMethods = 3
        /*
        val button2 = findViewById<Button>(R.id.button_home)
        val context = button2.context
        button2.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }*/
        when (Random.nextInt(numberOfMethods)) {
            0 -> intent = Intent(this, Gogh::class.java)
            1 -> intent = Intent(this, Nara::class.java)
            2 -> intent = Intent(this, Picasso::class.java)
            else -> intent = Intent(this, Dali::class.java)
        }
        startActivity(intent)


    }
}