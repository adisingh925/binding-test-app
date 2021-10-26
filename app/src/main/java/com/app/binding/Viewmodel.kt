package com.app.binding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Viewmodel : ViewModel() {

    val message = MutableLiveData<String>()

    fun updatename(text:String)
    {
        message.value = text
    }

}