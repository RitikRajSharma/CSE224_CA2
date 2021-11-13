package com.example.ca2q1q2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img: ImageView = findViewById(R.id.register)
        val getI = registerForActivityResult(
            ActivityResultContracts.GetContent(),
            ActivityResultCallback {
                img.setImageURI(it)
            }
        )

        img.setOnClickListener {
            getI.launch("image/*")
        }
    }
}