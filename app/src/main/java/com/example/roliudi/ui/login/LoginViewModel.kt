package com.example.roliudi.ui.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roliudi.domain.repository.userAuth.UserAuthRepository
import kotlinx.coroutines.launch

class LoginViewModel(private val userAuthRepository: UserAuthRepository) : ViewModel() {

    fun signInWithEmailAndPassword(email: String, password: String) {
        userAuthRepository.loginAuthUser(email, password) {
                //TODO liveData:Boolean = it
        }
    }

    fun sendPasswordResetEmail(email: String) {
        userAuthRepository.sendPasswordResetEmail(email)
    }
}