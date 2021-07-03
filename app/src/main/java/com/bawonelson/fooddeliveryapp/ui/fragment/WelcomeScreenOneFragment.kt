package com.bawonelson.fooddeliveryapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bawonelson.fooddeliveryapp.R
import com.bawonelson.fooddeliveryapp.databinding.FragmentLoginBinding
import com.bawonelson.fooddeliveryapp.databinding.FragmentWelcomeScreenOneBinding


class WelcomeScreenOneFragment : Fragment() {
    private var _binding: FragmentWelcomeScreenOneBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWelcomeScreenOneBinding.inflate(inflater, container, false)

        binding.welcomeOneNextButton .setOnClickListener{
            findNavController().navigate(R.id.action_welcomeScreenOneFragment_to_welcomeScreenTwoFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}