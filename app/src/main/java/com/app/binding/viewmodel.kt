package com.app.binding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class viewmodel : ViewModel() {

    val message = MutableLiveData<String>()

    fun updatname(text:String)
    {
        message.value = text
    }

}