package com.example.androiddagger2example

import dagger.Binds
import dagger.Module

@Module
abstract class NCBatteryModule {
    @Binds
   abstract  fun bindNCBatteryModule(ncBattery: NCBattery):Battery
}