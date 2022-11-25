package com.example.dbr41

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.delay
import java.util.concurrent.Executor

class  Mod {

    lateinit var auth: FirebaseAuth

    fun sigIn(email: String, password: String, cont: Context?, frag: Fragment){
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener() { task ->
                if (task.isSuccessful) {
                    Toast.makeText(cont, "Authentication Successful.", Toast.LENGTH_SHORT).show()
                    val user = auth.currentUser
                    println("user.toString() " + user.toString())
                    frag.findNavController().navigate(R.id.action_mainFragment_to_sigInFragment)
                } else {
                    Toast.makeText(/*getContext()*/cont, "Authentication failed.", Toast.LENGTH_SHORT).show()
                }
            }
    }

    fun sigUp(email: String, password: String, cont: Context?){
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener() { task ->
                if (task.isSuccessful) {
                    Toast.makeText(cont, "Registration Successful.", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(cont, "Registration failed.", Toast.LENGTH_SHORT).show()
                }
            }
    }

    fun getInst(){
        auth = FirebaseAuth.getInstance()
        println("getInst")
        println(auth.toString())
    }
}