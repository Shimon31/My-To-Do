package com.example.shimon.mytodo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.shimon.mytodo.Base.BaseFragment
import com.example.shimon.mytodo.databinding.FragmentLoginOrSignUpBinding

class loginOrSignUpFragment :
    BaseFragment<FragmentLoginOrSignUpBinding>(FragmentLoginOrSignUpBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {

            findNavController().navigate(R.id.action_loginOrSignUpFragment_to_loginFragment)

        }

        binding.btnSignUp.setOnClickListener {

            findNavController().navigate(R.id.action_loginOrSignUpFragment_to_signUpFragment)

        }
    }

}