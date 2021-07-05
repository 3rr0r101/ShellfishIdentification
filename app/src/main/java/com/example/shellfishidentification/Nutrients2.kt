package com.example.shellfishidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Nutrients2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrients2)
        val bnButton = findViewById<Button>(R.id.backtohbc)
        bnButton.setOnClickListener{
            val intent = Intent(this, HBclams::class.java)
            startActivity(intent)
        }

        val nnButton = findViewById<Button>(R.id.nexttohbm)
        nnButton.setOnClickListener{
            val intent = Intent(this, HBMussels::class.java)
            startActivity(intent)
        }





    }
}