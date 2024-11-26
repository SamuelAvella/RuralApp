package com.example.ruralapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ruralapp.R
import com.example.ruralapp.databinding.FragmentExpenseBinding


class ExpenseFragment : Fragment() {

    private lateinit var binding:FragmentExpenseBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExpenseBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }


}