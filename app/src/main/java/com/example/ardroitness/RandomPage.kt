package com.example.ardroitness

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.ardroitness.Adapter.ItemAdapter
import com.example.ardroitness.Art.Art
import com.example.ardroitness.dataSource.DataSource
import java.security.AccessController.getContext

class RandomPage : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_gallery)

        var artist:Int = (1..4).random()
        var artwork:Int = (0..3).random()
        var data = DataSource().loadDali()

        if (artist == 1) {
            var dataset = DataSource().loadPicasso()
            var data = listOf(dataset[artwork])
        }
        if (artist == 2) {
            var dataset = DataSource().loadDali()
            var data = listOf(dataset[artwork])
        }
        if (artist == 3) {
            var dataset = DataSource().loadGogh()
            var data = listOf(dataset[artwork])
        }
        if (artist == 4) {
            var dataset = DataSource().loadNara()
            var data = listOf(dataset[artwork])
        }

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, data)

        recyclerView.setHasFixedSize(true)

        /*
        val button2 = findViewById<Button>(R.id.button_home)
        val context = button2.context
        button2.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }*/


    }
}