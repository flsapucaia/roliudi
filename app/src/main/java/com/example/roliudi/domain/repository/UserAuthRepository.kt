package com.example.roliudi.domain.repository

import android.content.Context
import android.provider.Settings.Global.getString
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayoutStates
import com.example.roliudi.R
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth

class UserAuthRepository {

    private val mAuth: FirebaseAuth = FirebaseAuth.getInstance()

    fun registerAuthUser(){

    }

    fun loginAuthUser(context: AppCompatActivity, email: String, password: String): Boolean {
        var response = false

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(
            context, OnCompleteListener<AuthResult?> { task ->

                response = if (task.isSuccessful) {
                    Log.d(ConstraintLayoutStates.TAG, "signInWithEmail:success")
                    true
                } else {
                    Log.w(ConstraintLayoutStates.TAG, "signInWithEmail:failure", task.exception)
                    false
                }
            }
        )
        return response
    }

    fun sendPasswordResetEmail(email: String) {
        mAuth.sendPasswordResetEmail(email)
    }
}