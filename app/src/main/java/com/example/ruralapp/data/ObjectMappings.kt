package com.example.ruralapp.data

import android.icu.util.Currency
import android.icu.util.CurrencyAmount
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.ruralapp.data.local.expenses.ExpenseEntity
import com.example.ruralapp.data.local.participant.ParticipantEntity
import com.example.ruralapp.ui.participant.ParticipantFormUIState
import java.util.UUID

@RequiresApi(Build.VERSION_CODES.Q)
fun ExpenseEntity.toExternal():Expense{
    return Expense(
        id = UUID.fromString(this.id),
        description = this.description,
        amount = CurrencyAmount(
            this.amount,
            Currency.getInstance(this.currency)
        )
    )
}


fun ParticipantEntity.toExternal():Participant{
    return Participant(
        id = UUID.fromString(this.id),
        name = name,
        surname1 = surname1,
        surname2 = surname2
    )
}

fun Map<ParticipantEntity, List<ExpenseEntity>>.toExternal():List<Participant> {
    return this.map { (participantEntity, expenseEntities) ->
        val expenses = expenseEntities.map(ExpenseEntity::toExternal)
        Participant(
            id = UUID.fromString(participantEntity.id),
            name = participantEntity.name,
            surname1 = participantEntity.surname1,
            surname2 = participantEntity.surname2,
            expenses = expenses
        )
    }
}

fun Participant.toLocalEntity():ParticipantEntity{
    return ParticipantEntity(
        id = this.id.toString(),
        name = name,
        surname1 = surname1,
        surname2 = surname2
    )
}

fun Participant.toUi(): ParticipantFormUIState {
    return ParticipantFormUIState(
        id = this.id,
        name = this.name,
        surname1 = this.surname1,
        surname2 = this.surname2
    )
}

fun ParticipantFormUIState.toDomain(): Participant {
    return Participant(
        id = this.id,
        name = this.name,
        surname1 = this.surname1,
        surname2 = this.surname2
    )
}
