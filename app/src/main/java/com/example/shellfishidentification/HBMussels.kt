package com.example.shellfishidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HBMussels : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_h_b_mussels)

        val bnButton = findViewById<Button>(R.id.button6)
        bnButton.setOnClickListener{
            val intent = Intent(this, Nutrients2::class.java)
            startActivity(intent)
        }

        val bthButton = findViewById<Button>(R.id.button7)
        bthButton.setOnClickListener{
            val intent = Intent(this, Nutrients::class.java)
            startActivity(intent)
        }



    }
}