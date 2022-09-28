package com.example.notes.feature_notelist.data.repository

import com.example.notes.feature_notelist.data.local.NoteDao
import com.example.notes.feature_notelist.data.local.mappers.toNote
import com.example.notes.feature_notelist.data.local.mappers.toNoteEntity
import com.example.notes.feature_notelist.domain.model.Note
import com.example.notes.feature_notelist.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return noteDao
            .getAllNotes()
            .map { noteEntityList ->
                noteEntityList.map { it.toNote() }
            }
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id)?.toNote()
    }

    override suspend fun upsert(note: Note) {
        noteDao.upsert(note.toNoteEntity())
    }

    override suspend fun delete(note: Note) {
        noteDao.delete(note.toNoteEntity())
    }
}