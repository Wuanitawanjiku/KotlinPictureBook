package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureFiveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_five)

        var pictureFive = findViewById<Button>(R.id.btnPage5)
        pictureFive.setOnClickListener {
            var intent = Intent(baseContext, PictureFourActivity::class.java)
            startActivity(intent)
        }
    }
}