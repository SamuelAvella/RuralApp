package com.example.ruralapp.data

import android.icu.util.CurrencyAmount
import java.util.UUID

data class Expense(
    val id: UUID = UUID.randomUUID(),
    val description: String = "",
    val amount: CurrencyAmount
)

