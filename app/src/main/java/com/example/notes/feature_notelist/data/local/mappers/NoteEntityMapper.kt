package com.example.notes.feature_notelist.data.local.mappers

import com.example.notes.feature_notelist.data.local.entity.NoteEntity
import com.example.notes.feature_notelist.domain.model.Note

fun NoteEntity.toNote(): Note {
    return Note(
        title = title,
        content = content,
        timeStamp = timeStamp,
        color = color,
        id = id
    )
}

fun Note.toNoteEntity(): NoteEntity {
    return NoteEntity(
        title = title,
        content = content,
        timeStamp = timeStamp,
        color = color,
        id = id
    )
}