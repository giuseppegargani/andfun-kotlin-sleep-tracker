/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.trackmysleepquality

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


/**
 * This is the toy app for lesson 6 of the
 * Android App Development in Kotlin course on Udacity(https://www.udacity.com/course/???).
 *
 * The SleepQualityTracker app is a demo app that helps you collect information about your sleep.
 * - Start time, end time, quality, and time slept
 *
 * This app demonstrates the following views and techniques:
 * - Room database, DAO, and Coroutines
 *
 * It also uses and builds on the following techniques from previous lessons:
 * - Transformation map
 * - Data Binding in XML files
 * - ViewModel Factory
 * - Using Backing Properties to protect MutableLiveData
 * - Observable state LiveData variables to trigger navigation
 */

/**
 * This main activity is just a container for our fragments,
 * where the real action is.
 */
/*TODO - 1 Si crea una DataClass con i seguenti valori
    data class SleepNight  (
    var nightId: Long = 0L,
    val startTimeMilli: Long =  System.currentTimeMillis(),
    var endTimeMilli: Long = startTimeMilli,
    var sleepQuality: Int = -1
    )
 */

/*TODO - 2 Annota la DataClass con Entity e si mette il nome della tabella (daily_sleep_quality_table)
    @Entity(tableName = "daily_sleep_quality_table")
 */
/*TODO - 3 Annota la chiave primaria e metti gli opportuni valori
        @PrimaryKey(autoGenerate = true)
 */
/*TODO - 4 Annota la proprietà seguenti e personalizza il nome
        @Entity(tableName = "daily_sleep_quality_table")
data class SleepNight(
    @PrimaryKey(autoGenerate = true)
    var nightId: Long = 0L,

    @ColumnInfo(name = "start_time_milli")
    val startTimeMilli: Long = System.currentTimeMillis(),

    @ColumnInfo(name = "end_time_milli")
    var endTimeMilli: Long = startTimeMilli,

    @ColumnInfo(name = "quality_rating")
    var sleepQuality: Int = -1
)
 */

/*TODO VERIFICA E SINTESI
    Si può personalizzare come si vuole la data class relativa al DB
    SI POSSONO INIZIALIZZARE COME SI VOGLIONO!!!!!
    per esempio con il tempo corrente!!!!! System.currentTimeMillis()
    oppure si possono attribuendogli il valore di una altra variabile!!!!!!
 */


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}
