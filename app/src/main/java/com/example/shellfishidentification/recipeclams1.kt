package com.example.shellfishidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class recipeclams1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipeclams1)

        val bh1Button = findViewById<Button>(R.id.b2l)
        bh1Button.setOnClickListener{
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

        val nButton = findViewById<Button>(R.id.ntc2)
        nButton.setOnClickListener{
            val intent = Intent(this, Recipeclams2::class.java)
            startActivity(intent)
        }



    }
}