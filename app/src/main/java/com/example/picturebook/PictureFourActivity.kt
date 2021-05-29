package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureFourActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_four)

        var pictureFour = findViewById<Button>(R.id.btnPage4)
        pictureFour.setOnClickListener {
            var intent = Intent(baseContext, PictureFiveActivity::class.java)
            startActivity(intent)

        var backButton3 = findViewById<Button>(R.id.btnBack3)
        backButton3.setOnClickListener {
            var intent = Intent(baseContext, PictureThreeActivity::class.java)
        }
        }
    }
}