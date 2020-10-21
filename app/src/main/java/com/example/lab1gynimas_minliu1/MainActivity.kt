package com.example.lab1gynimas_minliu1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openPCustomerActivity(view : View) {
        val intent = Intent(this, CustomerActivity1::class.java)
        startActivity(intent)
    }
}