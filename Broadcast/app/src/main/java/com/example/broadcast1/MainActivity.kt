package com.example.broadcast1

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private val airPlaneModeReceiver = AirplaneModeReceiver()
    private val testReceiver = TestReceiver()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Register Receiver
        registerReceiver(
            airPlaneModeReceiver,
            IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        )
        registerReceiver(
            testReceiver,
            IntentFilter("TEST_ACTION")
        )

    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(airPlaneModeReceiver)
        unregisterReceiver(testReceiver)
    }
}