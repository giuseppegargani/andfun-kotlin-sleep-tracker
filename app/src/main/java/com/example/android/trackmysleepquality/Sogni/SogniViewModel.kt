package com.example.android.trackmysleepquality.Sogni

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.viewModelScope
import com.example.android.trackmysleepquality.database.SleepDatabaseDao
import com.example.android.trackmysleepquality.database.SleepNight
import com.example.android.trackmysleepquality.dbSogni.Sogno
import com.example.android.trackmysleepquality.dbSogni.SognoDatabaseDao
import com.example.android.trackmysleepquality.formatDreams
import com.example.android.trackmysleepquality.formatNights
import kotlinx.coroutines.launch

class SogniViewModel(
        val database: SognoDatabaseDao,
        application: Application) : AndroidViewModel(application) {

    private var thisDream = MutableLiveData<Sogno?>()

    private val dreams = database.getAllDreams()

    /**
     * Converted dreams to Spanned for displaying.
     */
    val dreamsString = Transformations.map(dreams) { sogni ->
        formatDreams(sogni, application.resources)
    }

    init {
        initializeThisDream()
    }

//    private fun initializeThisDream() {
//        viewModelScope.launch {
//            thisDream.value = getThisDreamFromDatabase()
//        }
//    }
//
//    private suspend fun getThisDreamFromDatabase(): SleepNight? {
//        var sogno = database.getThisDream()
//        return sogno
//    }

}