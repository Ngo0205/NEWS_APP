package com.example.newsapp.ui.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy


@Dao
interface AticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert ()
}