package com.example.notes.feature_notelist.domain.use_case

import com.example.notes.feature_notelist.domain.model.Note
import com.example.notes.feature_notelist.domain.repository.NoteRepository
import com.example.notes.feature_notelist.domain.utils.NoteOrder
import com.example.notes.feature_notelist.domain.utils.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotesUseCase(
    private val repository: NoteRepository
) {
    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)
    ): Flow<List<Note>> {
        return repository
            .getNotes()
            .map { notes ->
                when (noteOrder.orderType) {
                    is OrderType.Ascending -> {
                        when (noteOrder) {
                            is NoteOrder.Title -> notes.sortedBy { it.title.lowercase() }
                            is NoteOrder.Date -> notes.sortedBy { it.timeStamp }
                            is NoteOrder.Color -> notes.sortedBy { it.color }
                        }
                    }
                    is OrderType.Descending -> {
                        when (noteOrder) {
                            is NoteOrder.Title -> notes.sortedByDescending { it.title.lowercase() }
                            is NoteOrder.Date -> notes.sortedByDescending { it.timeStamp }
                            is NoteOrder.Color -> notes.sortedByDescending { it.color }
                        }
                    }
                }

            }
    }
}