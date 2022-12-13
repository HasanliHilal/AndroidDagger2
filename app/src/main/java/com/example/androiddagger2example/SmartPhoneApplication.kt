package com.example.androiddagger2example

import android.app.Application
import android.database.sqlite.SQLiteDatabase
import javax.inject.Singleton


class SmartPhoneApplication: Application() {
    lateinit var  smartPhoneComponent: SmartPhoneComponent
    override fun onCreate() {
        smartPhoneComponent=initDagger()
        super.onCreate()
    }
    private fun initDagger():SmartPhoneComponent{
        return  DaggerSmartPhoneComponent.create()
    }
}