package com.example.ruralapp.data.local.expenses

import android.icu.util.CurrencyAmount
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "expense")
data class ExpenseEntity(
    @PrimaryKey val id: String,
    val description: String,
    val amount: Double,
    val currency: String,
    val idParticipant: String
)
