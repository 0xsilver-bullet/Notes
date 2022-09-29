package com.example.notes.feature_notelist.domain.use_case

import com.example.notes.feature_notelist.domain.model.Note
import com.example.notes.feature_notelist.domain.repository.NoteRepository

class GetNoteUseCase(private val repository: NoteRepository) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}