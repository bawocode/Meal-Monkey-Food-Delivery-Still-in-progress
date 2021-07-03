package com.bawonelson.fooddeliveryapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bawonelson.fooddeliveryapp.R
import com.bawonelson.fooddeliveryapp.databinding.FragmentWelcomeScreenOneBinding
import com.bawonelson.fooddeliveryapp.databinding.FragmentWelcomeScreenTwoBinding


class WelcomeScreenTwoFragment : Fragment() {
    private var _binding: FragmentWelcomeScreenTwoBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWelcomeScreenTwoBinding.inflate(inflater, container, false)

        binding.welcomeTwoNextButton .setOnClickListener{
            findNavController().navigate(R.id.action_welcomeScreenTwoFragment_to_welcomeScreenThreeFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}