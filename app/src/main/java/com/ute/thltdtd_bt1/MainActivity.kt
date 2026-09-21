package com.ute.thltdtd_bt1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.ute.thltdtd_bt1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val myButton = Button(this).apply {
            text = "Click me!"
            setOnClickListener {
                Toast.makeText(this@MainActivity, "Đã bấm nút", Toast.LENGTH_SHORT).show()
            }
        }
        binding.layoutMain.addView(myButton)
    }
}