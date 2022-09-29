package com.example.notes.feature_notelist.presentation.notes

import com.example.notes.feature_notelist.domain.model.Note
import com.example.notes.feature_notelist.domain.utils.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
