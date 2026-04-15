package com.example.daycounter

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import java.util.Calendar

class MainActivity : Activity() {
    private lateinit var tvDays: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Bind views
        tvDays = findViewById(R.id.tvDays)

        // Get current day of year
        val calendar = Calendar.getInstance()
        val dayOfYear = calendar.get(Calendar.DAY_OF_YEAR)
        tvDays.text = "Today is Day $dayOfYear of the year"
    }
}