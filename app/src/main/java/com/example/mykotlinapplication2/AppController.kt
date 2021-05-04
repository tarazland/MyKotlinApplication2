package com.example.mykotlinapplication2

import android.app.Application

class AppController : Application() {

    init {
        instance = this
    }

    companion object {
        private var instance: AppController? = null

        fun applicationContext() : AppController {
            return instance as AppController
        }
    }

    override fun onCreate() {
        super.onCreate()
    }
}