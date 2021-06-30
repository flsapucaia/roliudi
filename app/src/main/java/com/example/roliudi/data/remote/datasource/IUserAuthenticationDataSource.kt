package com.example.roliudi.data.remote.datasource

interface IUserAuthenticationDataSource {

    fun loginAuth(email: String, password: String, callback:(Boolean) -> Unit)
    fun sendPasswordResetEmail(email: String)
}