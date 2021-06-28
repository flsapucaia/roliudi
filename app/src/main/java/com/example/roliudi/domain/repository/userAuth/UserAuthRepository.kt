package com.example.roliudi.domain.repository.userAuth

import android.content.Context
import com.example.roliudi.data.service.auth.UserAuthentication
import com.example.roliudi.domain.model.User

class UserAuthRepository(private val userAuthentication: UserAuthentication): IUserAuthRepository {
//    private val context: Context

//    override fun registerAuthUser(newUser: User): Boolean  =
//        userAuthentication.resisterAuthNewUser(newUser: User)

    override fun loginAuthUser(email: String, password: String): Boolean  =
        userAuthentication.loginAuth(email, password)

    override fun sendPasswordResetEmail(email: String) {
        userAuthentication.sendPasswordResetEmail(email)
    }
}