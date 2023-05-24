package com.example.appktxdz

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment


class FragmentSecond: Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnGoToMainFragmen: Button = requireActivity().findViewById(R.id.btnGoToMainFragment)
        btnGoToMainFragmen.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }

    }
}