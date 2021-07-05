package com.example.shellfishidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        // what will the button do is done here
        val listui = findViewById<Button>(R.id.listui)
        listui.setOnClickListener {

            val intent = Intent(this,ListActivity::class.java)
            startActivity(intent)
        }

    }
}