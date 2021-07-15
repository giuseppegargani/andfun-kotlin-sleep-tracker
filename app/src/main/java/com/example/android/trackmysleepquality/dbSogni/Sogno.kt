package com.example.android.trackmysleepquality.dbSogni

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sogni_table")
data class Sogno(
        @PrimaryKey(autoGenerate = true)
        var sognoId: Long = 0L,

        @ColumnInfo(name = "titolo_sogno")
        val titoloSogno: String = "Titolo vuoto",

        @ColumnInfo(name = "contenuto_sogno")
        var contenutoSogno: String = "Il sogno inizia con...",

        @ColumnInfo(name = "interesse_sogno")
        var interesseSogno: Int = -1
)