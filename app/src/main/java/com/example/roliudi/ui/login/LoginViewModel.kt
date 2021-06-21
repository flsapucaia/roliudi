package com.example.roliudi.ui.login

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.example.roliudi.domain.repository.UserAuthRepository

class LoginViewModel : ViewModel() {
    private val userAuthRepository = UserAuthRepository()

    fun signInWithEmailAndPassword(context: AppCompatActivity, email: String, password: String) =
        userAuthRepository.loginAuthUser(context, email, password)

    fun sendPasswordResetEmail(email: String) {
        userAuthRepository.sendPasswordResetEmail(email)
    }
}