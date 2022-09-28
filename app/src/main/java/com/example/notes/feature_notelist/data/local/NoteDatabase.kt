package com.example.notes.feature_notelist.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notes.feature_notelist.data.local.entity.NoteEntity

@Database(
    entities = [NoteEntity::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: NoteDao
}