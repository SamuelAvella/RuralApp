package com.example.ruralapp.data.local.expenses

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "expense")
data class ExpenseEntity(
    @PrimaryKey val id: String,
    val description: String,
    val total: Double,
    val idParticipant: String
)
