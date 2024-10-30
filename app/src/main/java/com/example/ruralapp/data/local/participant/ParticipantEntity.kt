package com.example.ruralapp.data.local.participant

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "participant")
data class ParticipantEntity(

    @PrimaryKey val id: String,
    val name: String,
    val surname1: String,
    val surname2: String?

)
