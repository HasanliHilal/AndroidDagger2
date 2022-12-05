package com.example.androiddagger2example

import android.util.Log

class Battery  @Inject  constructor(){
    init {
        Log.i("MYTAG","Battery Constructed")
    }
    fun getPower(){
        Log.i("MYTAG","Battery power is available")
    }
}