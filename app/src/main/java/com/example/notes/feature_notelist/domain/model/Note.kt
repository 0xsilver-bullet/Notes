package com.example.notes.feature_notelist.domain.model

import com.example.notes.ui.theme.*

data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    val id: Int?
){
    companion object {
        val noteColors = listOf(
            RedOrange,
            LightGreen,
            Violet,
            BabyBlue,
            RedPink
        )
    }
}

class InvalidNoteException(message: String): Exception(message)