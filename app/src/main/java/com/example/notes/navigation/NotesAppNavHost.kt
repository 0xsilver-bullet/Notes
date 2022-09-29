package com.example.notes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.notes.feature_notelist.presentation.notes.NotesScreen

@Composable
fun NotesAppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.NotesScreen.route) {
        composable(Screen.NotesScreen.route) {
            NotesScreen(navController = navController)
        }
    }
}