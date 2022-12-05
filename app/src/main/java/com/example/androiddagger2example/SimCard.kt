package com.example.androiddagger2example

import android.util.Log

class SimCard @Inject constructor(private  val serviceProvider:ServiceProvider) {
    init{
        Log.i("MYTAG","SIM Card Constructed")
    }
    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}