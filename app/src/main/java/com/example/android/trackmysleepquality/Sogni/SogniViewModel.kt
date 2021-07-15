package com.example.android.trackmysleepquality.Sogni

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.android.trackmysleepquality.database.SleepDatabaseDao
import com.example.android.trackmysleepquality.dbSogni.SognoDatabaseDao

class SogniViewModel(
        val database: SognoDatabaseDao,
        application: Application) : AndroidViewModel(application) {

}