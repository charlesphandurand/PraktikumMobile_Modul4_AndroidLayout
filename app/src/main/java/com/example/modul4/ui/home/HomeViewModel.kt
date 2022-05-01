package com.example.modul4.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.modul4.R

class HomeViewModel() : ViewModel() {
    private val _text = MutableLiveData<String>()
    val text: LiveData<String> get() = _text

    fun text(){
        _text.value = R.string.welcome.toString()
    }
}