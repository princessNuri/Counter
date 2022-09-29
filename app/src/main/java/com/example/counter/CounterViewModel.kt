package com.example.counter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel:ViewModel() {

    var result = MutableLiveData<Int>()

    var count=0

    fun increment(){
        count++
        result.value=count
    }
    fun decrement(){
        count--
        result.value=count
    }
}