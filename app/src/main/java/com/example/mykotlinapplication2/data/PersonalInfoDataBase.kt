package com.example.mykotlinapplication2.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [PersonalInfo::class],version = 1,exportSchema = false)
abstract class PersonalInfoDataBase : RoomDatabase() {

    abstract fun personalInfoDao():PersonalInfoDao

    companion object{

        @Volatile
        var INSTANCE : PersonalInfoDataBase? = null

        fun getDataBase(context: Context) : PersonalInfoDataBase{

            val tempInstance = INSTANCE

            if (tempInstance != null){
                return tempInstance
            }

            synchronized(this){
                val instance=Room.databaseBuilder(
                    context.applicationContext,
                    PersonalInfoDataBase::class.java,
                    "personal_info_database"
                ).build()
                INSTANCE=instance
                return instance
            }
        }
    }
}