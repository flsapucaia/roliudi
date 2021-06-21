package com.example.roliudi.ui.register

import android.os.Bundle
import android.view.View
import com.example.roliudi.R
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.roliudi.ui.main.MainActivity
import kotlinx.android.synthetic.main.fragment_register.*

class RegisterFragment : Fragment(R.layout.fragment_register) {
    private lateinit var viewModel: RegisterViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)
        initListeners()
    }

    private fun initListeners() {
        register_button.setOnClickListener {
            val email = email_user_edt.text.trim()
            val password = password_user_edt.text.trim()

            if (email.isNotEmpty() && password.isNotEmpty() && password == confirm_password_edt.text.trim()) {
//                createUserWithEmailAndPassword(email.toString(), password.toString())
//                mAuthCreateUserWithEmailAndPassword(email.toString(), password.toString())
            } else (activity as MainActivity?)!!.showMessage(showErrorMessage())
        }
    }

//    private fun mAuthCreateUserWithEmailAndPassword(context: App,email: String, password: String){
//        (activity as MainActivity?)!!.mAuth.createUserWithEmailAndPassword(email, password).run {
//            (activity as MainActivity?)!!.showMessage(getString(R.string.confirmationMessage))
//        }
//        findNavController().navigate(RegisterFragmentDirections.actionNavRegisterToNavLogin())
//    }

    private fun showErrorMessage() = when{
        email_user_edt.toString().isEmpty() ->  getString(R.string.error01)
        password_user_edt.toString().isEmpty() -> getString(R.string.error02)
        password_user_edt.text.toString() != confirm_password_edt.text.toString() -> getString(R.string.error03)
        else -> getString(R.string.error00)
    }
}