package com.example.shellfishidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Recipeclams3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipeclams3)

        val bButton = findViewById<Button>(R.id.btc3)
        bButton.setOnClickListener{
            val intent = Intent(this, Recipeclams2::class.java)
            startActivity(intent)
        }

        val nextButton = findViewById<Button>(R.id.ntm1)
        nextButton.setOnClickListener{
            val intent = Intent(this, Recipemussels1::class.java)
            startActivity(intent)
        }

    }
}