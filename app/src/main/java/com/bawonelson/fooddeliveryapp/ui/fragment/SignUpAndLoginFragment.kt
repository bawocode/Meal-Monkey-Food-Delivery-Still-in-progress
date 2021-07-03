package com.bawonelson.fooddeliveryapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bawonelson.fooddeliveryapp.R
import com.bawonelson.fooddeliveryapp.databinding.FragmentSignUpAndLoginBinding


class SignUpAndLoginFragment : Fragment() {
    private var _binding: FragmentSignUpAndLoginBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpAndLoginBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.mainLoginButton.setOnClickListener {
            findNavController().navigate(R.id.action_signUpAndLoginFragment_to_loginFragment)
        }
        binding.createAnAccountButton.setOnClickListener {
            findNavController().navigate(R.id.action_signUpAndLoginFragment_to_signUpFragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}