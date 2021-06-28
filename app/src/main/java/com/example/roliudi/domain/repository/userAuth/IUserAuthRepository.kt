package com.example.roliudi.domain.repository.userAuth

import com.example.roliudi.domain.model.User

interface IUserAuthRepository {
//    fun registerAuthUser(newUser: User): Boolean
    fun loginAuthUser(email: String, password: String): Boolean
    fun sendPasswordResetEmail(email: String)
}