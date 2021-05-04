package com.example.mykotlinapplication2.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var list1= MutableLiveData<String>()

    fun getList(): LiveData<String> {
        return list1
    }

    fun addToList(str:String){
        list1.value=str
    }

}