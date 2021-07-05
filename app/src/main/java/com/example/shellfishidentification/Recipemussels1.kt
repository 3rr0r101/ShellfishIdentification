package com.example.shellfishidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Recipemussels1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipemussels1)

        val bButton = findViewById<Button>(R.id.btc3)
        bButton.setOnClickListener{
            val intent = Intent(this, Recipeclams2::class.java)
            startActivity(intent)
        }

        val nButton = findViewById<Button>(R.id.ntm2)
        nButton.setOnClickListener{
            val intent = Intent(this, Recipemussels2::class.java)
            startActivity(intent)
        }

    }
}