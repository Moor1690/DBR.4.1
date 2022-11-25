package com.example.dbr41

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.dbr41.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        println("MainFragment")
        binding = FragmentMainBinding.inflate(inflater, container, false)
        val btnSigUp = binding.BtnSigUp
        val btnSigIn = binding.BtnSigIn
        val editLogin = binding.EditLogin
        val editPassword = binding.editPassword
        var m: Mod = Mod()
        m.getInst()
        btnSigUp.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_sigUpFragment)
        }
        btnSigIn.setOnClickListener {//ВХОД
            if ((editLogin.text.toString() != "" || editPassword.text.toString() != "")) {
                m.sigIn(editLogin.text.toString(), editPassword.text.toString(), context, this)
            } else {
                Toast.makeText(context, "Login or Password is null", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }
}