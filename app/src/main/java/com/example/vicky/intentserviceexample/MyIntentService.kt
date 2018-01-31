package com.example.vicky.intentserviceexample

import android.app.IntentService
import android.content.Intent
import android.util.Log

/**
 * Created by VickY on 2018-01-26.
 */
class MyIntentService : IntentService("MyIntentService"){
    override fun onHandleIntent(intent: Intent?) {

        when(intent?.getIntExtra("type",0)){
            TYPEONE ->for(i in 1..5){
                Log.d("MyIntentService", "Task 1. " + i)
                Thread.sleep(1000)
            }
            TYPETWO -> for(i in 1..5){
                Log.d("MyIntentService", "Task 2. " + i)
                Thread.sleep(1000)
            }
        }



    }

}