package com.example.notes.feature_notelist.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotesUseCase,
    val getNoteById: GetNoteUseCase,
    val addNote: AddNoteUseCase,
    val deleteNotes: DeleteNoteUseCase
)
