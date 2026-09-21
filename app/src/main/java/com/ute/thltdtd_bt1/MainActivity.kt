package com.ute.thltdtd_bt1


import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
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
            // Tạo Button và set Constraint để nó nằm dưới TextView
            val myButton = Button(this@MainActivity).apply {
                text = "CLICK ME!"
                setBackgroundColor(Color.BLUE)
                setTextColor(Color.WHITE)

                // Cấu hình vị trí trong ConstraintLayout
                layoutParams = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
                ).apply {
                    // Đặt Button nằm BÊN DƯỚI TextView (tvName)
                    topToBottom = tvName.id
                    // Căn giữa theo chiều ngang
                    startToStart = ConstraintLayout.LayoutParams.PARENT_ID
                    endToEnd = ConstraintLayout.LayoutParams.PARENT_ID
                    topMargin = 32 // Margin top
                }

                setOnClickListener {
                    Toast.makeText(this@MainActivity, "Bạn đã bấm nút!", Toast.LENGTH_SHORT).show()
                }
            }

            // Thêm Button vào ConstraintLayout
            layoutMain.addView(myButton)
        }
    }
}