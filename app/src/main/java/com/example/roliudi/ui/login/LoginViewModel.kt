package com.example.roliudi.ui.login

import androidx.lifecycle.ViewModel
import com.example.roliudi.domain.repository.userAuth.UserAuthRepository

class LoginViewModel : ViewModel() {
    private val userAuthRepository = UserAuthRepository()

    fun signInWithEmailAndPassword(email: String, password: String) =
        userAuthRepository.loginAuthUser(email, password)

    fun sendPasswordResetEmail(email: String) {
        userAuthRepository.sendPasswordResetEmail(email)
    }
}