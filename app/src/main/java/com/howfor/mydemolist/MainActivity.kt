package com.howfor.mydemolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHello = findViewById<Button>(R.id.btn_hello)
        val btnAppName = findViewById<Button>(R.id.btn_app_name)

        btnHello.setOnClickListener {
            Toast.makeText(this, "世界你好啊！", Toast.LENGTH_SHORT).show()
        }
        btnAppName.setOnClickListener {
            val pm = packageManager
            val applicationInfo = pm.getApplicationInfo("com.howfor.invokedemo", 0)
            val appName = pm.getApplicationLabel(applicationInfo)
            Log.d("daisy", "appName $appName")
        }
    }
}