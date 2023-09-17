package com.example.broadcast1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.util.Log

class TestReceiver: BroadcastReceiver() {
    val myTag="AIR_PLANE"
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action=="TEST_ACTION"){

            Log.e(myTag,"Test Action received")

        }
    }
}