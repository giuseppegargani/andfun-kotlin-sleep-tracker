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

package com.example.android.trackmysleepquality.sleeptracker

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.android.trackmysleepquality.database.SleepDatabaseDao

/**
 * ViewModel for SleepTrackerFragment.
 */
class SleepTrackerViewModel(
        val database: SleepDatabaseDao,
        application: Application) : AndroidViewModel(application) {

    /*TODO (01) Declare Job() and cancel jobs in onCleared().
        var viewModelJob = Job()
     */

    /*TODO (02) Define uiScope for coroutines.
        var uiScope = CoroutineScope(Dispatchers.Main+viewmodelJob)
     */

    /*TODO (03) Create a MutableLiveData variable tonight for one SleepNight.
        Chiaramente si inizializza (con il valore null)   e la variabile è private
        private var tonight = MutableLiveData<SleepNight?>()
     */

    /*TODO (04) Define a variable, nights. Then getAllNights() from the database
        //and assign to the nights variable.   e' private e val
        private val nights = database.getAllNights()
     */

    /*TODO (05) In an init block, initializeTonight(), and implement it to launch a coroutine
        to getTonightFromDatabase(). e che quindi lancia una coroutine su IO, ed anche questa può essere private
        init {
            initializeTonight()
        }
        private fun initializeTonight() {
            uiScope.launch {
            tonight.value = getTonightFromDatabase()
            }
        }
     */

    /*TODO (06) Implement getTonightFromDatabase()as a suspend function.
        prima dichiara ed inizializza una variabile nuova (night) con il valore dell'ultima notte dal Database
        e poi restituisce null se tempo iniziale e finale sono diversi
        private suspend fun getTonightFromDatabase(): SleepNight? {
        return withContext(Dispatchers.IO) {
        var night = database.getTonight()
        if (night?.endTimeMilli != night?.startTimeMilli) {
        night = null
        }
        night
        }
        }
     */

    /*TODO (07) Implement the click handler for the Start button, onStartTracking(), using
        coroutines. Define the suspend function insert(), to insert a new night into the database.
        inizializza una variabile nuova (newNight) ed inserisci nel database invocando una funzione suspend insert, aggiorna il valore di tonight invocando la funzione getTonightFromDatabase
        fun onStartTracking(){
        uiScope.launch {
            val newNight = SleepNight()
            insert(newNight)
            tonight.value = getTonightFromDatabase()
        }
        }
        private suspend fun insert(night: SleepNight) {
            database.insert(night)
        }
     */

    /*TODO (08) Create onStopTracking() for the Stop button with an update() suspend function.
        Se il valore è null ritorna dalla funzione launch, altrimenti calcola tempo finale e aggiorna database
        fun onStopTracking() {
        uiScope.launch {
        val oldNight = tonight.value ?: return@launch
         oldNight.endTimeMilli = System.currentTimeMillis()
            update(oldNight)
        }
        }
        private suspend fun update(night:SleepNight) {
        withContext(Dispatchers.IO) {
            database.update(night)
        }
        }

     */

    /*TODO (09) For the Clear button, created onClear() with a clear() suspend function.
        fun onClear(){
            uiScope.launch {
            clear()
            tonight.value=null
            }
        }
        private suspend fun clear() {
            withContext(Dispatchers.IO){
            database.clear()
            }
        }
     */

    /*TODO (12) Transform nights into a nightsString using formatNights().
        si usano mappe di trasformazioni (su variabile nights) che mappano con la funzione formatNights (di util e a cui va tolto come commento) e che ha come secondo parametro resources
        val nightsString = Transformations.map(nights) { nights ->
        formatNights(nights, application.resources)
        }
     */

    /*TODO (13) Aggiorna i riferimenti nel layout XML sia come elenco di testo che come listeners
     */
}

