package com.example.notes.feature_notelist.domain.use_case

import com.example.notes.feature_notelist.domain.model.InvalidNoteException
import com.example.notes.feature_notelist.domain.model.Note
import com.example.notes.feature_notelist.domain.repository.NoteRepository

class AddNoteUseCase(private val repository: NoteRepository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Title of the note can't be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("Content of the note can't be blank")
        }
        repository.upsert(note)
    }
}