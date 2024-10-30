package com.example.ruralapp.data.local.participant

import com.example.ruralapp.data.Participant

interface ParticipantLocalDataSource {

    suspend fun create(participant: Participant)

    suspend fun readAll():List<Participant>
}