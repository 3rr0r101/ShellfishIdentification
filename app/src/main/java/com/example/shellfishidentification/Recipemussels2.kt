package com.example.shellfishidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Recipemussels2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipemussels2)

        val bButton = findViewById<Button>(R.id.btm1)
        bButton.setOnClickListener{
            val intent = Intent(this, Recipemussels1::class.java)
            startActivity(intent)
        }

        val nButton = findViewById<Button>(R.id.ntm3)
        nButton.setOnClickListener{
            val intent = Intent(this, Recipemussels3::class.java)
            startActivity(intent)
        }

    }
}