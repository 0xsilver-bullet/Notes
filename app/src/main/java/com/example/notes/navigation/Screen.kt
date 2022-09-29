package com.example.notes.navigation

sealed class Screen(val route: String) {

    object NotesScreen: Screen("notes_screen")
}
