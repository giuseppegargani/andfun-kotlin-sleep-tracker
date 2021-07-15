package com.example.android.trackmysleepquality.Sogni

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.trackmysleepquality.database.SleepDatabaseDao
import com.example.android.trackmysleepquality.dbSogni.SognoDatabaseDao
import com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel

class SogniViewModelFactory(
        private val dataSource: SognoDatabaseDao,
        private val application: Application) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SogniViewModel::class.java)) {
            return SogniViewModel(dataSource, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}