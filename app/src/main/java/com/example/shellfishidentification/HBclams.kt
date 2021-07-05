package com.example.shellfishidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class HBclams : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_h_bclams)

        val bButton = findViewById<Button>(R.id.button6)
        bButton.setOnClickListener{
            val intent = Intent(this, Nutrients::class.java)
            startActivity(intent)
        }

        val nButton = findViewById<Button>(R.id.button7)
        nButton.setOnClickListener{
            val intent = Intent(this, Nutrients2::class.java)
            startActivity(intent)
        }


    }
}