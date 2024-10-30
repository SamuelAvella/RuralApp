package com.example.ruralapp.data.local.participant

import com.example.ruralapp.data.Participant
import javax.inject.Inject

class ParticipantDefaultRepository
    @Inject constructor(
        private val localDataSource: ParticipantLocalDataSource
    ):ParticipantRepository{

    override suspend fun readAll(): List<Participant> {
        return localDataSource.readAll()
    }

    override suspend fun create(participant: Participant) {
        return localDataSource.create(participant)
    }


}