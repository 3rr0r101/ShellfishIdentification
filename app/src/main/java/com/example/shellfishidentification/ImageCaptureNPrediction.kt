@file:Suppress("unused")

package com.example.shellfishidentification

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.shellfishidentification.ml.AugShellMobilenet
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.image.TensorImage
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer

class ImageCaptureNPrediction : AppCompatActivity() {

    lateinit var bitmap: Bitmap
    lateinit var imgview : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_capture_n_prediction)

        imgview = findViewById(R.id.rimageView)
        val fileName = "labels.txt"
        val inputString = application.assets.open(fileName).bufferedReader().use { it.readText() }
        var townList = inputString.split("\n")



        var tv = findViewById<TextView>(R.id.textView2)




        var select = findViewById<Button>(R.id.select)
        select.setOnClickListener(View.OnClickListener {
            var intent : Intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"

            startActivityForResult(intent, 100)


        })

        var predict = findViewById<Button>(R.id.predict)
        predict.setOnClickListener(View.OnClickListener {

            var resized : Bitmap = Bitmap.createScaledBitmap(bitmap,224,224,true)
            val model = AugShellMobilenet.newInstance(this)

// Creates inputs for reference.
            val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 224, 224, 3), DataType.FLOAT32)

            var tbuffer = TensorImage.fromBitmap(resized)
            var byteBuffer = tbuffer.buffer
            inputFeature0.loadBuffer(byteBuffer)

            inputFeature0.loadBuffer(byteBuffer)




// Runs model inference and gets result.
            val outputs = model.process(inputFeature0)
            val outputFeature0 = outputs.outputFeature0AsTensorBuffer


            var max = getMax(outputFeature0.floatArray)
            tv.setText(townList[max])

// Releases model resources if no longer used.
            model.close()
        })


        fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)

            imgview.setImageURI(data?.data)
            var uri: Uri ?= data?.data
            bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, uri)




        }


        
    }


    fun getMax(arr:FloatArray) : Int {

        var ind =0
        var min = 0.0f

        for (i in 0..3)
        {
            if (arr[i]>min)
            {
                ind = 1
                min = arr[i]
            }
        }

        return ind
    }
}


/*
 inside runs model//



           inside input//


           */