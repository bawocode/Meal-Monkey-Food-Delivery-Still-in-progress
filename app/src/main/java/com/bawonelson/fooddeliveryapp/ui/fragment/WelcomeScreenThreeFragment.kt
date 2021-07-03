package com.bawonelson.fooddeliveryapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bawonelson.fooddeliveryapp.R
import com.bawonelson.fooddeliveryapp.databinding.FragmentWelcomeScreenOneBinding
import com.bawonelson.fooddeliveryapp.databinding.FragmentWelcomeScreenThreeBinding


class WelcomeScreenThreeFragment : Fragment() {
    private var _binding: FragmentWelcomeScreenThreeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWelcomeScreenThreeBinding.inflate(inflater, container, false)

        binding.welcomeThreeNextButton .setOnClickListener{
            findNavController().navigate(R.id.action_welcomeScreenThreeFragment_to_homeScreenActivity)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}