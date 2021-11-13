package com.example.ca2q1q2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class ques2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ques2)
        val radio = findViewById<RadioButton>(R.id.radio1)
        val checkBox = findViewById<CheckBox>(R.id.check1)

        radio.setOnClickListener {

                Toast.makeText(this, "LPU's STUDENT", Toast.LENGTH_SHORT).show()

        }

        checkBox.setOnClickListener {
            if (checkBox.isChecked) {
                Toast.makeText(this, "Lateral Entry Selected", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Regular Selected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}