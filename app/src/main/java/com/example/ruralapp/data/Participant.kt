package com.example.ruralapp.data

import java.util.UUID

class Participant(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val surname1: String,
    val surname2: String?,
    val expenses: List<Expense> = listOf()
)