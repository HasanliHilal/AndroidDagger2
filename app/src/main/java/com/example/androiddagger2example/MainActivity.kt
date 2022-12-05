package com.example.androiddagger2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val smartPhone = SmartPhone(Battery(),SimCard(ServiceProvider()),MemoryCard())
        smartPhone.makeCallWithRecording()
    }
}