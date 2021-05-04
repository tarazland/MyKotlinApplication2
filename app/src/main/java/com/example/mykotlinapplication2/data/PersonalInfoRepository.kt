package com.example.mykotlinapplication2.data

import androidx.lifecycle.LiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PersonalInfoRepository
    (
    private val personalInfoDao: PersonalInfoDao
) {

    //val readAllData: LiveData<List<PersonalInfo>> = personalInfoDao.readAllData()

    suspend fun addPersonalInfo(personalInfo: PersonalInfo) {
        personalInfoDao.addPersonalInfo(personalInfo)
    }

     suspend fun readAllData() : List<PersonalInfo>{
             return personalInfoDao.readAllData()
    }

}