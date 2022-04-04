package me.lwn.cakom.android

import android.app.Application

/**
 * Created by fatterx on 2022/4/4
 */
class BizApplication : Application() {
    init {
        instance = this
    }

    companion object {
        private lateinit var instance: Application
        fun getInstance(): Application = instance
    }
}