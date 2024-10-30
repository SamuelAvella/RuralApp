package com.example.ruralapp.ui.participant

import androidx.lifecycle.ViewModel
import com.example.ruralapp.data.local.participant.ParticipantRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.UUID
import javax.inject.Inject

data class ParticipantFormUIState(
    val id: UUID =  UUID.randomUUID(),
    val name: String = "",
    val surname1: String = "",
    val surname2: String? = null
)

@HiltViewModel
class ParticipantFormViewModel
    @Inject constructor(
        private val repository: ParticipantRepository
    ): ViewModel(){

        private val _uiState = MutableStateFlow<ParticipantFormUIState>(ParticipantFormUIState())
        val uiState: StateFlow<ParticipantFormUIState>
            get() = _uiState.asStateFlow()
    fun createParticipant(name: String, surname1: String, surname2: String?){

    }
}