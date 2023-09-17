package com.example.sendbroadcast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val send_button= findViewById<Button>(R.id.broadcast_send_bt)
        send_button.setOnClickListener{
            sendBroadcast(
            Intent("TEST_ACTION")
            )
        }
    }
}