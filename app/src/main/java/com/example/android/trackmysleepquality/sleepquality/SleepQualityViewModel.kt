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

package com.example.android.trackmysleepquality.sleepquality

/*TODO (03) Using the code in SleepTrackerViewModel for reference, create SleepQualityViewModel. E si devono anche impostare JOB, Coroutines e onCleared()
    with coroutine setup and navigation setup.
    Ha come costruttori una variabile con la chiave primaria della notte (private val) e il riferimento al DAO del database e restituisce un ViewModel()
    class SleepQualityViewModel(
    private val sleepNightKey: Long = 0L,
    val database: SleepDatabaseDao) : ViewModel() {
    }
    private val viewModelJob = Job()
    private val uiScope =  CoroutineScope(Dispatchers.Main + viewModelJob)
    override fun onCleared() {
    super.onCleared()
    viewModelJob.cancel()
    }
 */

/*TODO (04) implement the onSetSleepQuality() click handler using coroutines. Per navigare indietro imposta analoga variabile incapsulata navigateToSleepTracker e funzione, e il clickHandler onSetSleepQuality
    onSetSleepQuality usa Coroutine interna, prende la notte sulla base della chiave, la modifica ed aggiorna, e modifica la funzione di navigazione all'indietro!!!
    private val _navigateToSleepTracker =  MutableLiveData<Boolean?>()
    val navigateToSleepTracker: LiveData<Boolean?>
    get() = _navigateToSleepTracker
    fun doneNavigating() {
     _navigateToSleepTracker.value = null
    }
    fun onSetSleepQuality(quality: Int) {
    uiScope.launch {
     withContext(Dispatchers.IO) {
        val tonight = database.get(sleepNightKey) ?: return@withContext
        tonight.sleepQuality = quality
        database.update(tonight)
     }
     _navigateToSleepTracker.value = true
   }
    }
 */