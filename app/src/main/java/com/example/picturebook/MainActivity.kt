package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnMainPage = findViewById<Button>(R.id.btnMainPage)
        btnMainPage.setOnClickListener {
            var intent = Intent(baseContext, PictureOneActivity::class.java)
            startActivity(intent)
        }
    }
}
