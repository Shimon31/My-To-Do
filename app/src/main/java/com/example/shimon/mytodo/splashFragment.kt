package com.example.shimon.mytodo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController
import com.example.shimon.mytodo.Base.BaseFragment
import com.example.shimon.mytodo.databinding.FragmentSplashBinding


class splashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {

    private val splashTime :Long = 2000

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Initialize()



        Handler(Looper.getMainLooper()).postDelayed({

           findNavController().navigate(R.id.action_splashFragment_to_loginOrSignUpFragment)

        },splashTime)




    }

    private fun Initialize() {
        var appLogo = binding.imageLogo

        val topAnim = AnimationUtils.loadAnimation(requireContext(),
            androidx.constraintlayout.widget.R.anim.abc_fade_in)
        appLogo.startAnimation(topAnim)

    }


}

