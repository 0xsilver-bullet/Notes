package com.example.notes.feature_notelist.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.notes.ui.theme.*

@Entity(tableName = "notes_table")
data class NoteEntity(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey(autoGenerate = true) val id: Int? = null
)