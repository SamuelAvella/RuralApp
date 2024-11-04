package com.example.ruralapp.data.local.participant

import com.example.ruralapp.data.Participant
import kotlinx.coroutines.flow.Flow

interface ParticipantLocalDataSource {

    suspend fun create(participant: Participant)

    suspend fun readAll():List<Participant>

    suspend fun observeAll(): Flow<List<Participant>>
}