package com.example.ardroitness


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.ardroitness.Adapter.ItemAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.button_random)
        button.setOnClickListener(){
            intent = Intent(this, RandomPage::class.java)
            startActivity(intent)
        }

        val goghButton = findViewById<ImageButton>(R.id.gogh_button)
        goghButton.setOnClickListener(){
            //intent = Intent(this, RandomPage::class.java)
            intent = Intent(this, Gogh::class.java)
            startActivity(intent)
        }

        val daliButton = findViewById<ImageButton>(R.id.dali_button)
        daliButton.setOnClickListener(){
            //intent = Intent(this, RandomPage::class.java)
            intent = Intent(this, Dali::class.java)
            startActivity(intent)
        }

        val picassoButton = findViewById<ImageButton>(R.id.picasso_button)
        picassoButton.setOnClickListener(){
            //intent = Intent(this, RandomPage::class.java)
            intent = Intent(this, Picasso::class.java)
            startActivity(intent)
        }

        val naraButton = findViewById<ImageButton>(R.id.nara_button)
        naraButton.setOnClickListener(){
            //intent = Intent(this, RandomPage::class.java)
            intent = Intent(this, Nara::class.java)
            startActivity(intent)
        }



        /* val intent = Intent(context, DetailActivity::class.java)
        intent.putExtra(DetailActivity.NAME)
        context.startActivity(intent) */
    }
}