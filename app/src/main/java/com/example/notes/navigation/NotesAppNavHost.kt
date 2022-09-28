package com.example.notes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun NotesAppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "TODO"){
        // TODO: Add Screens composable
    }
}