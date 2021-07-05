package com.example.shellfishidentification

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.Toast

private const val REQUEST_CODE = 42
class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        supportActionBar?.hide()
        //properties of button
        val imbutton = findViewById<ImageButton>(R.id.imbutton)
        imbutton.setOnClickListener{

            val intent =Intent(this, WebApp::class.java)
            startActivity(intent)



        }

        val NutButton=findViewById<ImageButton>(R.id.nbutton)
        NutButton.setOnClickListener{
            val intent = Intent(this, Nutrients::class.java)
            startActivity(intent)
        }



        val recipeButton = findViewById<ImageButton>(R.id.recipe)
        recipeButton.setOnClickListener{

            val intent = Intent(this, recipeclams1::class.java)
            startActivity(intent)
        }

    }






    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            val takenImage = data?.extras?.get("data") as Bitmap
        } else {

            super.onActivityResult(requestCode, resultCode, data)
        }
    }
}

/*

 // once button is clicked, it will open the camera
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            if (takePictureIntent.resolveActivity(this.packageManager) !=null) {
                startActivityForResult(takePictureIntent, REQUEST_CODE)
            }
            else {
                //error handling
                Toast.makeText(this, "Unable to open Camera", Toast.LENGTH_SHORT).show()
            }
 */