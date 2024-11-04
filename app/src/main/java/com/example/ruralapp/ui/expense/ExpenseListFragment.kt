package com.example.ruralapp.ui.expense

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.ruralapp.R
import com.example.ruralapp.databinding.FragmentExpenseListBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ExpenseListFragment : Fragment() {

    private lateinit var binding:FragmentExpenseListBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        // Inflate the layout for this fragment
        binding = FragmentExpenseListBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun OnViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        binding.createExpenseFab.setOnClickListener{
            val action = ExpenseListFragmentDirections.actionExpenseListFragmentToExpenseCreateFragment()
            view.findNavController().navigate(action)
        }
    }

}