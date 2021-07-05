package com.example.shellfishidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Nutrients : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrients)

        val bthButton = findViewById<Button>(R.id.backfromn1)
        bthButton.setOnClickListener{
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }


        val next1Button = findViewById<Button>(R.id.nextonnutr)
        next1Button.setOnClickListener{
            val intent = Intent(this, HBclams::class.java)
            startActivity(intent)
        }




    }



}

