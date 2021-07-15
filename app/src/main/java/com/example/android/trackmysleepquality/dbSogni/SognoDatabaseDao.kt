package com.example.android.trackmysleepquality.dbSogni

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.android.trackmysleepquality.database.SleepNight

@Dao
interface SognoDatabaseDao {

    @Insert
    suspend fun insert(sogno: Sogno)
    /**
     * When updating a row with a value already set in a column,
     * replaces the old value with the new one.
     *
     * @param night new value to write
     */
    @Update
    suspend fun update(sogno: Sogno)

    /**
     * Selects and returns the row that matches the supplied start time, which is our key.
     *
     * @param key startTimeMilli to match
     */
    @Query("SELECT * from sogni_table WHERE sognoId = :key")
    suspend fun get(key: Long): Sogno?

    /**
     * Deletes all values from the table.
     *
     * This does not delete the table, only its contents.
     */
    @Query("DELETE FROM sogni_table")
    suspend fun clear()

    /**
     * Selects and returns all rows in the table,
     *
     * sorted by start time in descending order.
     */
    @Query("SELECT * FROM sogni_table ORDER BY sognoId DESC")
    fun getAllDreams(): LiveData<List<Sogno>>

    /**
     * Selects and returns the latest night.
     */
    @Query("SELECT * FROM sogni_table ORDER BY sognoId DESC LIMIT 1")
    suspend fun getTonight(): Sogno?

}