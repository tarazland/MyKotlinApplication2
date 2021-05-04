package com.example.mykotlinapplication2.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_personalInfo")
data class PersonalInfo(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var name: String,
    val family: String,
    val tel: String
)