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

/*TODO - 1 Crea un Job e fai override per cancellarlo
    private var viewModelJob = Job()
    override fun onCleared() {
   super.onCleared()
   viewModelJob.cancel()
    }
 */
/*TODO - 2 Definisci uno Scope per le coroutines
    private val uiScope = CoroutineScope(Dispatchers.Main +  viewModelJob)
 */
/*TODO - 3 Definisci una variabile Tonight che tiene il valore corrente
    Deve essere MutableLiveData
    private var tonight = MutableLiveData<SleepNight?>()
 */
/*TODO - 4 Definisci una variabile ed assegna il valore di tutte le notti
    private val nights = database.getAllNights()
 */
/*TODO - 5 Per inizializzare crea un blocco init ed assegnali un metodo
    init {
    initializeTonight()
    }
 */
/*TODO - 6 Implementa InitializeTonight
    In UIscope lancia una Coroutine
    private fun initializeTonight() {
     uiScope.launch {
     tonight.value = getTonightFromDatabase()
     }
    }
 */
/*TODO - 7 Implementa GetTonightFromDatabase
    Definisci una private suspend function che restituisce un nullable SleepNight se non c'è nessun corrent sleepNight
    private suspend fun getTonightFromDatabase():  SleepNight? { }
 */
/*TODO - 8  Restituisci il risultato da una coroutine che esegue nel context Dispatcher.Io
    return withContext(Dispatchers.IO) {}
 */
/*TODO - 9 Lascia che la coroutine prenda tonight dal Database
    Se il tempo iniziale e finale non sono uguale restituisci null, altrimenti restituisci night
    var night = database.getTonight()
    if (night?.endTimeMilli != night?.startTimeMilli) {
    night = null
    }
    night
 */

/*TODO - 10 Dentro onStartTracking lancia una coroutine, istanzia una nuova SleepNight, inseriscila nel DB,
        fun onStartTracking() {
        viewModelScope.launch {
            val newNight = SleepNight()
            insert(newNight)
            tonight.value = getTonightFromDatabase()
        }
    }
 */

/*TODO - 11 IMPOSTA TONIGHT COME NUOVA NOTTE
    tonight.value = getTonightFromDatabase()
 */
/*TODO - 12 Crea una funzione Insert che lancia una coroutine nel IoContext e inserisce night nel DB
    withContext(Dispatchers.IO) {
    database.insert(night)
    }
 */

/*TODO - 13 AGGIUNGI ONSTOPTRACKING che lancia una Coroutine nel UiSCope
        Dopo che in precedenza si era inserita la voce nel DB adesso si provvede a aggiornare la voce dello stop della notte inserita
    fun onStopTracking() {
    uiScope.launch {
        val oldNight = tonight.value ?: return@launch
        oldNight.endTimeMilli = System.currentTimeMillis()
        update(oldNight)
    }
    }
 */
/*TODO - 14 IMPLEMENTA update() usando lo stesso pattern di Insert()
    private suspend fun update(night: SleepNight) {
    withContext(Dispatchers.IO) {
     database.update(night)
    }
    }
 */
/*TODO - 15 Implementa analogamente OnClear e Clear(
    fun onClear() {
    uiScope.launch {
     clear()
     tonight.value = null
   }
    }
    suspend fun clear() {
    withContext(Dispatchers.IO) {
        database.clear()
    }
    }
 */
/*TODO - 16 Aggiungi gli handlers ai tre pulsanti nei files XML
    android:onClick="@{() ->  sleepTrackerViewModel.onStartTracking()}"
 */
/*TODO - 17 Formatta il testo di nights usando la funzione formatNights()
    val nightsString = Transformations.map(nights) { nights ->
    formatNights(nights, application.resources)
    }
 */
/*TODO - 18 fai gli opportuni collegamenti in Fragment_sleep_tracker
    "@{sleepTrackerViewModel.nightsString}"
 */

/*TODO VERIFICA E SINTESI

 */

/**
 * This main activity is just a container for our fragments,
 * where the real action is.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}
