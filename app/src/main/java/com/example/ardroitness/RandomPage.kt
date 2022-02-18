package com.example.ardroitness

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.security.AccessController.getContext

class RandomPage : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.random_page)

        /*
        val button2 = findViewById<Button>(R.id.button_home)
        val context = button2.context
        button2.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }*/


    }
}