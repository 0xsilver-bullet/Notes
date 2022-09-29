package com.example.notes.feature_notelist.presentation.notes

import com.example.notes.feature_notelist.domain.model.Note
import com.example.notes.feature_notelist.domain.utils.NoteOrder
import com.example.notes.feature_notelist.domain.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
