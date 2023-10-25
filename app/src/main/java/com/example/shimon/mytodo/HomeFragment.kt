package com.example.shimon.mytodo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.shimon.mytodo.Base.BaseFragment
import com.example.shimon.mytodo.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtPersonality.setOnClickListener {

            findNavController().navigate(R.id.action_homeFragment_to_personalityFragment)

        }

        binding.txtWorkTodayS.setOnClickListener {

            findNavController().navigate(R.id.action_homeFragment_to_workTodayFragment)

        }

        binding.txtSetting.setOnClickListener {

            findNavController().navigate(R.id.action_homeFragment_to_settingFragment)

        }
    }

}