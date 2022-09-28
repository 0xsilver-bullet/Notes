package com.example.notes.feature_notelist.domain.model

data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    val id: Int?
)
