package com.example.notes.di

import android.content.Context
import androidx.room.Room
import com.example.notes.feature_notelist.data.local.NoteDao
import com.example.notes.feature_notelist.data.local.NoteDatabase
import com.example.notes.feature_notelist.domain.repository.NoteRepository
import com.example.notes.feature_notelist.domain.use_case.AddNoteUseCase
import com.example.notes.feature_notelist.domain.use_case.DeleteNoteUseCase
import com.example.notes.feature_notelist.domain.use_case.GetNotesUseCase
import com.example.notes.feature_notelist.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(@ApplicationContext context: Context): NoteDatabase {
        return Room
            .databaseBuilder(
                context,
                NoteDatabase::class.java,
                "NoteDB.db"
            )
            .build()
    }

    @Provides
    @Singleton
    fun provideNoteDao(noteDatabase: NoteDatabase): NoteDao {
        return noteDatabase.noteDao
    }

    @Provides
    @Singleton
    fun provideNotesUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotesUseCase(repository),
            addNote = AddNoteUseCase((repository)),
            deleteNotes = DeleteNoteUseCase(repository)
        )
    }
}