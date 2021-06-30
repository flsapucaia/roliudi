package com.example.roliudi.ui.about

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.roliudi.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class AboutFragment : Fragment(R.layout.fragment_about) {

    private val viewModel: AboutViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}