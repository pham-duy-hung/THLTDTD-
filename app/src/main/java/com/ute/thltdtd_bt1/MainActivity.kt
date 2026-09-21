package com.ute.thltdtd_bt1


import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.ute.thltdtd_bt1.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
        }

        with(binding) {
            showToast("Chào mừng bạn!")

            val myButton = Button(this@MainActivity).apply {
                setStyle("BẤM VÀO ĐÂY", Color.GREEN, Color.BLACK) // Đặt text và màu sắc

                val marginPx = 16.dpToPx(this@MainActivity)
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply {
                    setMargins(0, 32, 0, 0)
                }

                setOnClickListener {
                    progressBarHorizontal.hide()
                    showToast("Đã ẩn ProgressBar!")
                }
            }

            layoutMain.addView(myButton)
        }
    }
}