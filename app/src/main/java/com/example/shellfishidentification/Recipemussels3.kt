package com.example.shellfishidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Recipemussels3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipemussels3)

        val bButton = findViewById<Button>(R.id.btm2)
        bButton.setOnClickListener{
            val intent = Intent(this, Recipemussels2::class.java)
            startActivity(intent)
        }

        val btsButton = findViewById<Button>(R.id.btc1)
        btsButton.setOnClickListener{
            val intent = Intent(this, recipeclams1::class.java)
            startActivity(intent)
        }

    }
}