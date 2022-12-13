package com.example.androiddagger2example

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SmartPhone @Inject constructor(val battery: Battery, val simCard: SimCard, val memoryCard: MemoryCard) {
     init {
         Log.i("MAYTAG","SmartPhone constructed")
     }
    fun makeCallWithRecording(){
        Log.i("MAYTAG","makeCallWithRecording")
    }
}