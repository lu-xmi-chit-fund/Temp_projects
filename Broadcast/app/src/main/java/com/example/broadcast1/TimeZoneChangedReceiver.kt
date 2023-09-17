package com.example.broadcast1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.util.Log

class TimeZoneChangedReceiver: BroadcastReceiver() {
    val myTag="TIME_ZONE"
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action== Intent.ACTION_TIMEZONE_CHANGED){
            Log.e(myTag,"Time Zone changed?")
        }
    }
}