package com.example.roliudi.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.roliudi.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val viewModel: HomeViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}