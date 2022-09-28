package com.example.notes.feature_notelist.domain.use_case

import com.example.notes.feature_notelist.domain.model.Note
import com.example.notes.feature_notelist.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend fun invoke(note: Note) {
        repository.delete(note)
    }
}