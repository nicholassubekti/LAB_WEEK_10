package com.example.lab_week_10.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Total::class], version = 2)  // Changed from 1 to 2
abstract class TotalDatabase : RoomDatabase() {
    abstract fun totalDao(): TotalDao
}