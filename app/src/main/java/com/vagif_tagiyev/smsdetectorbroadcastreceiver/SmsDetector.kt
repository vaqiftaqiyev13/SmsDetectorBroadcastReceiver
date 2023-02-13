package com.vagif_tagiyev.smsdetectorbroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.telephony.SmsMessage
import android.widget.Toast

class SmsDetector : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        val smsIntent = intent?.extras

        if (smsIntent != null) {
            val pdusObj = smsIntent.get("pdus") as Array<*>

            for (i in pdusObj.indices){
                val currentMessage:SmsMessage

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q){
                    val format = smsIntent.getString("format")
                    currentMessage = SmsMessage.createFromPdu(pdusObj[i] as ByteArray,format)

                }



            }

        }



        Toast.makeText(context, "You have a new message", Toast.LENGTH_SHORT).show()

    }
}