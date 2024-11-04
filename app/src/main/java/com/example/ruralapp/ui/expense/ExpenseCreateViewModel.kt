package com.example.ruralapp.ui.expense

import androidx.lifecycle.ViewModel
import com.example.ruralapp.data.Participant
import com.example.ruralapp.data.local.participant.ParticipantRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExpenseCreateViewModel @Inject constructor(
    private val participantRepository: ParticipantRepository,
    // TODO() private val expenseRepository: ExpenseRepository
) : ViewModel(){

    suspend fun getParticipants():List<Participant>{
        return participantRepository.readAll()
    }


}