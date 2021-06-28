package com.example.roliudi.data.service.auth

import android.content.Context
import android.util.Log
import androidx.constraintlayout.widget.ConstraintLayoutStates
import com.example.roliudi.domain.model.User
import com.example.roliudi.ui.main.MainActivity
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class UserAuthentication () {
    private val mAuth: FirebaseAuth = FirebaseAuth.getInstance()

    fun loginAuth(email: String, password: String): Boolean {
        var response = false

//        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(
//            context, OnCompleteListener<AuthResult?> { task ->
//
//                response = if (task.isSuccessful) {
//                    Log.d(ConstraintLayoutStates.TAG, "signInWithEmail:success")
//                    true
//                } else {
//                    Log.w(ConstraintLayoutStates.TAG, "signInWithEmail:failure", task.exception)
//                    false
//                }
//            }
//        )
        return response
    }

    fun sendPasswordResetEmail(email: String){
        mAuth.sendPasswordResetEmail(email)
    }
}