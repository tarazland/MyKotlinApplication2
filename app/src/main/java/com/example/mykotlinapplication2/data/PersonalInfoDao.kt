package com.example.mykotlinapplication2.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PersonalInfoDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addPersonalInfo(personalInfo: PersonalInfo)

    @Query("select * from tbl_personalInfo order by id Desc")
    suspend fun readAllData(): List<PersonalInfo>

}