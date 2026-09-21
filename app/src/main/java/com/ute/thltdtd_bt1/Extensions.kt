package com.ute.thltdtd_bt1

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.annotation.ColorInt


fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}


fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}

fun Button.setStyle(
    textString: String,
    @ColorInt bgColor: Int = Color.BLUE,
    @ColorInt textColor: Int = Color.WHITE
) {
    text = textString
    setBackgroundColor(bgColor)
    setTextColor(textColor)
}

fun Int.dpToPx(context: Context): Int {
    return (this * context.resources.displayMetrics.density).toInt()
}