package com.example.roliudi.domain.repository.userAuth

import com.example.roliudi.data.remote.datasource.IUserAuthenticationDataSource

class UserAuthRepository(
    private val userAuthenticationDataSource: IUserAuthenticationDataSource
) : IUserAuthRepository {

//    override fun registerAuthUser(newUser: User): Boolean  =
//        userAuthentication.resisterAuthNewUser(newUser: User)

    override fun loginAuthUser(email: String, password: String, callback:(Boolean) -> Unit) =
        userAuthenticationDataSource.loginAuth(email, password, callback)

    override fun sendPasswordResetEmail(email: String) =
        userAuthenticationDataSource.sendPasswordResetEmail(email)
}