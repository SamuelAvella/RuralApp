package com.example.ruralapp.data.local.participant

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.ruralapp.data.Participant
import com.example.ruralapp.data.toExternal
import com.example.ruralapp.data.toLocalEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ParticipantLocalDataSourceDataBase
    @Inject constructor(
        private val dao:ParticipantDao
    ):ParticipantLocalDataSource{

    override suspend fun create(participant: Participant) {
        withContext(Dispatchers.IO){
            dao.create(
                participant.toLocalEntity()
        )}
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override suspend fun readAll(): List<Participant> {
        return withContext(Dispatchers.IO){
            dao.readParticipantsWithExpenses().toExternal()
        }
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override suspend fun observeAll(): Flow<List<Participant>> {
        return dao.observeParticipantsWithExpenses().map {
            it.toExternal()
        }
    }


    /*override suspend fun readAll() = withContext(Dispatchers.IO) {
        return dao.readAll().toExternal()
    }*/


}