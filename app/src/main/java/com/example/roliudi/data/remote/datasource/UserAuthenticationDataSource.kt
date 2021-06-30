package com.example.roliudi.data.remote.datasource

import android.util.Log
import androidx.constraintlayout.widget.ConstraintLayoutStates
import com.google.firebase.auth.FirebaseAuth

class UserAuthenticationDataSource(private val mAuth: FirebaseAuth): IUserAuthenticationDataSource {

    override fun loginAuth(email: String, password: String, callback:(Boolean) -> Unit) {
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                callback(true)
                Log.d(ConstraintLayoutStates.TAG, "signInWithEmail:success")
            } else {
                callback(false)
                Log.w(ConstraintLayoutStates.TAG, "signInWithEmail:failure", task.exception)
            }
        }
    }

    override fun sendPasswordResetEmail(email: String) {
        mAuth.sendPasswordResetEmail(email)
    }
}