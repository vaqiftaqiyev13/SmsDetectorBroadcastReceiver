package com.vagif_tagiyev.smsdetectorbroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class SmsDetector:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"You have a new message",Toast.LENGTH_SHORT).show()
    }
}