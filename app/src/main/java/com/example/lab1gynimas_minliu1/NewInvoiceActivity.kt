package com.example.lab1gynimas_minliu1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NewInvoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_invoice)
    }
    fun openMainActivity(view : View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}