package com.example.androiddagger2example

import android.util.Log

class ServiceProvider @Inject constructor() {
    init{
        Log.i("MYTAG","Service Provide Constructed")
    }
    fun getServiceProvider(){
        Log.i("MYTAG","Service provider connectedt")
    }
}