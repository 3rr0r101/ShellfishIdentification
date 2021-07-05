package com.example.shellfishidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.shellfishidentification.R.id.ntc33

class Recipeclams2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipeclams2)
        val baButton = findViewById<Button>(R.id.btc11)
        baButton.setOnClickListener{
            val intent = Intent(this, recipeclams1::class.java)
            startActivity(intent)
        }

        val neButton = findViewById<Button>(R.id.ntc33)
        neButton.setOnClickListener{
            val intent = Intent(this, Recipemussels1::class.java)
            startActivity(intent)
        }
    }
}