package com.example.ruralapp.data.local.participant

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ParticipantDao {

    @Insert
    suspend fun create(participant: ParticipantEntity)

    @Delete
    suspend fun delete(participant: ParticipantEntity)

    @Update
    suspend fun update(participant: ParticipantEntity)

    @Query("SELECT * FROM participant")
    suspend fun readAll():List<ParticipantEntity>

    @Query("SELECT * FROM participant WHERE id = :id")
    suspend fun readOne(id:String): ParticipantEntity

    @Query("SELECT * FROM participant")
    fun observeAll(): Flow<ParticipantEntity>

}