package com.example.modul4

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HewanViewModel : ViewModel() {
    private val _nama: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val nama: LiveData<String>
        get() = _nama

    private val _deskripsi: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val deskripsi: LiveData<String>
        get() = _deskripsi

    private val _imageDrawable: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    val imageDrawable: LiveData<Int>
        get() = _imageDrawable


    fun setHewan(hewan: Hewan, context: Context) {
        _nama.value = context.resources.getString(hewan.name)
        _deskripsi.value = context.resources.getString(hewan.description)
        _imageDrawable.value = hewan.imageResourceId
    }
}