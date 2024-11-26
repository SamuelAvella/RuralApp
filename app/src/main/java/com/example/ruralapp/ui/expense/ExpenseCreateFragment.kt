package com.example.ruralapp.ui.expense

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.ruralapp.R
import com.example.ruralapp.databinding.FragmentExpenseCreateBinding
import com.example.ruralapp.databinding.FragmentExpenseListBinding
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import kotlinx.coroutines.launch

class ExpenseCreateFragment : Fragment() {

    private lateinit var binding: FragmentExpenseCreateBinding
    private val viewModel: ExpenseCreateViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExpenseCreateBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                viewModel.refresh
                val participants = viewModel.getParticipants().map{
                    participant -> "${participant.name} ${participant.surname1}";
                }

                val participantsArray:Array<String> = Array(participants.size,{ position ->
                    if (position == 0){
                        ""
                    } else{
                        participants[position-1]
                    }
                })

                (binding.participantInput as MaterialAutoCompleteTextView).setSimpleItems(participants)
            }
        }
    }

}