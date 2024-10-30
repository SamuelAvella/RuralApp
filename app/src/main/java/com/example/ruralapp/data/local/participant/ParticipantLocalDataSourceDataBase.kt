package com.example.ruralapp.data.local.participant

import com.example.ruralapp.data.Participant
import com.example.ruralapp.data.toLocalEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ParticipantLocalDataSourceDataBase
    @Inject constructor(
        private val dao:ParticipantDao
    ):ParticipantLocalDataSource{

    override suspend fun create(participant: Participant) {
        dao.create(
            participant.toLocalEntity()
        )
    }

    override suspend fun readAll() = withContext(Dispatchers.IO) {
        return dao.readAll().toExternal()
    }


}