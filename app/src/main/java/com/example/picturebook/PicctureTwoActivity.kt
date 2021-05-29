package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PicctureTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piccture_two)

        var pictureFour = findViewById<Button>(R.id.btnPage2)
        pictureFour.setOnClickListener {
            var intent = Intent(baseContext, PictureThreeActivity::class.java)
            startActivity(intent)
        }

        var backbutton1 = findViewById<Button>(R.id.btnBack1)
        backbutton1.setOnClickListener {
            var intent = Intent(baseContext, PictureOneActivity::class.java)
            startActivity(intent)
        }
    }
}