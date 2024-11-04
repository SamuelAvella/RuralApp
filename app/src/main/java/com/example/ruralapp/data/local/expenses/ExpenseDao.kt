package com.example.ruralapp.data.local.expenses

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.ruralapp.data.local.participant.ParticipantEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ExpenseDao {

    @Insert
    suspend fun create(expense: ExpenseEntity)

    @Delete
    suspend fun delete(expense: ExpenseEntity)

    @Update
    suspend fun update(expense: ExpenseEntity)

    @Query("SELECT * FROM expense")
    suspend fun readAll():List<ExpenseEntity>

    @Query("SELECT * FROM expense WHERE idParticipant = :id")
    suspend fun readExpensesByParticipantId(id:String): List<ExpenseEntity>

    @Query("SELECT * FROM expense")
    fun observeAll(): Flow<ExpenseEntity>


}