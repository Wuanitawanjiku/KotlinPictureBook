package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PicctureTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piccture_two)

        val pictureTwo = findViewById<Button>(R.id.btnPage2)
        pictureTwo.setOnClickListener {
            val intent = Intent(baseContext, PictureThreeActivity::class.java)
            startActivity(intent)
        }

        val backbutton1 = findViewById<Button>(R.id.btnBack1)
        backbutton1.setOnClickListener {
            val intent = Intent(baseContext, PictureOneActivity::class.java)
            startActivity(intent)
        }
    }
}