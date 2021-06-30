package com.example.roliudi.ui.login

import android.os.Bundle
import android.view.View
import com.example.roliudi.R
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*
import com.example.roliudi.ui.main.MainActivity
import kotlinx.android.synthetic.main.fragment_login.login_button
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment : Fragment(R.layout.fragment_login) {

    private val viewModel: LoginViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListener()
        observeEvents()
    }

    private fun observeEvents() {
//        viewModel.observe liveData do callback
//        (activity as MainActivity).atualizar o drawerLayout
    }

    private fun initListener() {
        forgot_password_ck.setOnClickListener {
            forgotPassword(login_user.text.trim().toString())
        }

        register_ck.setOnClickListener {
            val actionRegister = LoginFragmentDirections.actionNavLoginToNavRegister()
            findNavController().navigate(actionRegister)
        }

        login_button.setOnClickListener {
            loginWithEmailAndPassword(
                login_user.text.trim().toString(),
                login_password_user.text.trim().toString()
            )
        }
    }

    private fun forgotPassword(email: String) {
        (activity as MainActivity).run{
            viewModel.sendPasswordResetEmail(email)
            showMessage("Impossível fazer login!") // TO DO Tela de update de senha!
        }
    }

    private fun loginWithEmailAndPassword(email: String, password: String) {
        (activity as MainActivity).run{
            when {
                email.isEmpty() -> showMessage(getString(R.string.error01))
                password.isEmpty() -> showMessage(getString(R.string.error02))
                else -> {
                    if (// TODO substituir viewModel.signInWithEmailAndPassword(email, password) pelo liveData
                     true) {
                        showMessage(getString(R.string.confirmationMessage))
                        onStart()
                    } else showMessage(getString(R.string.error04))
                }
            }
        }
    }
}