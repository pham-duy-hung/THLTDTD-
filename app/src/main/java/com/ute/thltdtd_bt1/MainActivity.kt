package com.ute.thltdtd_bt1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val layoutMain = findViewById<LinearLayout>(R.id.layoutMain)
        val myButton = Button(this).apply{
            text="click here"
            setOnClickListener { Toast.makeText(this@MainActivity,"Bạn đã ấn nút",Toast.LENGTH_SHORT).show() }
        }

        layoutMain.addView(myButton)
    }
}