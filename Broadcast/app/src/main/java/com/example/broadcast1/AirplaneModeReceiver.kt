package com.example.broadcast1


import android.content.BroadcastReceiver
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.util.Log
import android.widget.Toast

class AirplaneModeReceiver: BroadcastReceiver() {
    val myTag="AIR_PLANE"
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action==Intent.ACTION_AIRPLANE_MODE_CHANGED){
            val isTurnedOn= Settings.Global.getInt(
                context?.contentResolver,
                Settings.Global.AIRPLANE_MODE_ON
            )!=0
            Log.e(myTag,"Is airplane mode on? $isTurnedOn")

        }
    }
}