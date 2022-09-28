package com.example.notes.feature_notelist.domain.repository

import com.example.notes.feature_notelist.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun upsert(note: Note)

    suspend fun delete(note: Note)
}