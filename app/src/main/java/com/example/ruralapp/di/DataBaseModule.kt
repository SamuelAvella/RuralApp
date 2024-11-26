package com.example.ruralapp.di

import android.content.Context
import androidx.room.Room
import com.example.ruralapp.data.local.participant.ParticipantDao
import com.example.ruralapp.data.local.RuralAppDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule {

    @Provides
    @Singleton
        fun provideDataBase(@ApplicationContext context: Context):RuralAppDataBase{
        val dataBase = Room.databaseBuilder(context,
                                            RuralAppDataBase::class.java,
                                            "ruralApp-db").build()

        return dataBase
    }

    @Provides
    fun provideParticipanDao(dataBase: RuralAppDataBase): ParticipantDao {
        return  dataBase.participantDao()
    }
}