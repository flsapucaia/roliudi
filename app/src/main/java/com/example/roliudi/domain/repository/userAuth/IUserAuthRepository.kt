package com.example.roliudi.domain.repository.userAuth

interface IUserAuthRepository {
//    fun registerAuthUser(newUser: User): Boolean
    fun loginAuthUser(email: String, password: String, callback:(Boolean) -> Unit)
    fun sendPasswordResetEmail(email: String)
}