package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_one)

        var pictureOne = findViewById<Button>(R.id.btnPage1)
        pictureOne.setOnClickListener {
            var intent = Intent(baseContext, PicctureTwoActivity::class.java)
            startActivity(intent)
        }

        var homebuttton = findViewById<Button>(R.id.btnHome)
        homebuttton.setOnClickListener {
            var intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
