package com.example.roliudi.ui.main

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.roliudi.R
import androidx.navigation.ui.*
import android.content.DialogInterface
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.ui.NavigationUI
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.roliudi.ui.login.LoginFragmentDirections
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

import androidx.navigation.fragment.findNavController
import com.example.roliudi.ui.login.LoginFragmentDirections
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_register.*
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.nav_header_main.*
import kotlinx.android.synthetic.main.nav_header_main.view.*
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModel()

    lateinit var mAuth: FirebaseAuth
    private val navController by lazy {
        findNavController(R.id.nav_host_fragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        mAuth = FirebaseAuth.getInstance()
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        NavigationUI.setupWithNavController(navView, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, drawer_layout)
    }

    fun showAlertDialog(
        dialogTitle: String = "",
        dialogMessage: String = getString(R.string.dialogMessage),
        positiveMessage: String = getString(R.string.confirmationMessage),
        negativeMessage: String = getString(R.string.negativeMessage),
        btnPositiveName: String = getString(R.string.dialogPositiveBtn),
        btnNegativeName: String = getString(R.string.dialogNegativeBtn)
    ): Boolean {
        var dialogResponse = false

        AlertDialog.Builder(this).apply {
            if (dialogTitle != "") setTitle(dialogTitle)
            setMessage(dialogMessage)

            setPositiveButton(btnPositiveName) { _: DialogInterface, _: Int ->
                run {
                    dialogResponse = true
                    if (positiveMessage != "") showMessage(positiveMessage)
                }
            }

            setNegativeButton(btnNegativeName) { _: DialogInterface, _: Int ->
                run {
                    dialogResponse = false
                    if (negativeMessage != "") showMessage(negativeMessage)
                }
            }
        }
        return dialogResponse
    }

    fun updateUI(currentUser: FirebaseUser?) {
        header_hello_user.run {
            setVisible(true)
            String.format(getString(R.string.hello_user), currentUser?.displayName)
        }
        header_login_button.run {
            setVisible(false)
        }
        onBackPressed()
    }

    override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
//        val currentUser = mAuth.currentUser
//        if(currentUser != null) updateUI(currentUser)
    }

    fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}