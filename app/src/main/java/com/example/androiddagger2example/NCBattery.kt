package com.example.androiddagger2example

import android.util.Log
import javax.inject.Inject

class NCBattery  @Inject constructor() :Battery{
    override fun getPower() {
        Log.e("MAYTAG","NcBatteryLogss GerPower function")
    }
}