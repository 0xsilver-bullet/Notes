package com.example.notes.di

import android.content.Context
import androidx.room.Room
import com.example.notes.feature_notelist.data.local.NoteDatabase
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
}