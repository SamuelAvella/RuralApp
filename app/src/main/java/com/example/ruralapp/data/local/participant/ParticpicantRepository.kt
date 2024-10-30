package com.example.ruralapp.data.local.participant

import com.example.ruralapp.data.Participant

interface ParticipantRepository {

    suspend fun readAll():List<Participant>

    suspend fun create(participant: Participant)
}