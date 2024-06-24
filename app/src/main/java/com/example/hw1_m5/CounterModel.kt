package com.example.hw1_m5

class CounterModel{
    private var count = 0

    fun inc(){
        count++

    }
    fun dec(){
        count--
    }
    fun getResult() = count
}
