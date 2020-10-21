package com.example.lab1gynimas_minliu1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CustomerActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer1)
    }
    fun openNewIntentActivity(view : View) {
        val intent = Intent(this, NewInvoiceActivity::class.java)
        startActivity(intent)
    }
}