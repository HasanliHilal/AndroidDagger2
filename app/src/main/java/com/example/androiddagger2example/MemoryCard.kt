package com.example.androiddagger2example

import android.util.Log

class MemoryCard @Inject constructor(){
    init{
        Log.i("MYTAG","MemoryCard Constructed")
    }
    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available")
    }
}