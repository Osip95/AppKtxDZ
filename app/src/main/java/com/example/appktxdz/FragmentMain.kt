package com.example.appktxdz

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

class FragmentMain : Fragment(R.layout.fragment_main) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnGoToFragmentSecond: Button = requireActivity().findViewById(R.id.btnGoToSecondFragment)
        btnGoToFragmentSecond.setOnClickListener {
            requireActivity().supportFragmentManager.commit {
                replace(R.id.container, FragmentSecond())
                addToBackStack(null)
            }
        }

    }
}