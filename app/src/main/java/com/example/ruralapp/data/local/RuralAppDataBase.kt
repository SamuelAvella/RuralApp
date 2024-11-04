package com.example.ruralapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ruralapp.data.local.expenses.ExpenseEntity
import com.example.ruralapp.data.local.participant.ParticipantDao
import com.example.ruralapp.data.local.participant.ParticipantEntity

@Database(
    entities = [ParticipantEntity::class,
                ExpenseEntity::class],
    version = 2
)
abstract class RuralAppDataBase(): RoomDatabase() {

    abstract fun participantDao(): ParticipantDao
}