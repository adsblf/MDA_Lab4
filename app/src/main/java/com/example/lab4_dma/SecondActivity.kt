package com.example.lab4_dma

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("name")
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Привет, $name!"
        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val button = findViewById<Button>(R.id.buttonOk)

        button.setOnClickListener {
            val calendar = Calendar.getInstance()
            calendar.set(datePicker.year, datePicker.month, datePicker.dayOfMonth)
            val intent = Intent()
            intent.putExtra("date", calendar.timeInMillis)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}