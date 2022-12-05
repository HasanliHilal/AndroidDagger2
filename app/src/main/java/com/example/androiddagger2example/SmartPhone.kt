package com.example.androiddagger2example

class SmartPhone @Inject constructor(val battery: Battery,val simCard: SimCard,val memoryCard: MemoryCard) {

    fun makeCallWithRecording(){

    }
}