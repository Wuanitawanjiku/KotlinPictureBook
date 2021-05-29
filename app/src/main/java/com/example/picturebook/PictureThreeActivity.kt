package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_three)

        var pictureThree = findViewById<Button>(R.id.btnPage3)
        pictureThree.setOnClickListener {
            var intent = Intent(baseContext, PictureFourActivity::class.java)
            startActivity(intent)
      }

        var backButton2 = findViewById<Button>(R.id.btnBack2)
        backButton2.setOnClickListener {
            var intent = Intent(baseContext, PicctureTwoActivity::class.java)
            startActivity(intent)
        }
    }
}
