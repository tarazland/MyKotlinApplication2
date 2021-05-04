package com.example.mykotlinapplication2.data

import android.app.Application
import androidx.lifecycle.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PersonalInfoViewModel(application: Application) : AndroidViewModel(application) {


    private val readAllData : MutableLiveData<List<PersonalInfo>> = MutableLiveData()
    private val repository : PersonalInfoRepository


    init {
        val personalInfoDao=PersonalInfoDataBase.getDataBase(application).personalInfoDao()
        repository= PersonalInfoRepository(personalInfoDao)
        viewModelScope.launch(Dispatchers.IO){
            readAllData.postValue(repository.readAllData())
        }
    }

    fun addPersonalInfo(personalInfo: PersonalInfo){
        viewModelScope.launch(Dispatchers.IO){
            repository.addPersonalInfo(personalInfo)
        }
    }

    fun readAllData():LiveData<List<PersonalInfo>>{
        return readAllData
    }

}