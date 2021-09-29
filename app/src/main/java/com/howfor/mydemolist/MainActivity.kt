package com.howfor.mydemolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHello = findViewById<Button>(R.id.btn_hello)
        btnHello.setOnClickListener {
            Toast.makeText(this, "世界你好啊！", Toast.LENGTH_SHORT).show()
        }
    }
}