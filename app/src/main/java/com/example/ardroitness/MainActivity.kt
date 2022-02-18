package com.example.ardroitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_random)
        button.setOnClickListener(){
            intent = Intent(this, RandomPage::class.java)
            startActivity(intent)
        }


        /* val intent = Intent(context, DetailActivity::class.java)
        intent.putExtra(DetailActivity.NAME)
        context.startActivity(intent) */
    }
}