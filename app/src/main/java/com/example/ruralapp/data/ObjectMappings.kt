package com.example.ruralapp.data

import com.example.ruralapp.data.local.participant.ParticipantEntity

fun Participant.toLocalEntity():ParticipantEntity{
    return ParticipantEntity(
        id = this.id.toString(),
        name = name,
        surname1 = surname1,
        surname2 = surname2
    )
}

fun ParticipantEntity.toExternal():Participant{
    return Participant(
        id = this.id.toString(),
        name = name,
        surname1 = surname1,
        surname2 = surname2
    )
}

fun List<Participant>.toExternal():List<Participant>{
    return
}