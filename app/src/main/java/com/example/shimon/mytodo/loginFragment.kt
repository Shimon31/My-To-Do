package com.example.shimon.mytodo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.shimon.mytodo.Base.BaseFragment
import com.example.shimon.mytodo.databinding.FragmentLoginBinding


class loginFragment : BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtForgotPasswor.setOnClickListener {

            findNavController().navigate(R.id.action_loginFragment_to_forgotPassFragment)

        }

        binding.btnNext.setOnClickListener {

            findNavController().navigate(R.id.action_loginFragment_to_homeFragment)

        }

    }

}