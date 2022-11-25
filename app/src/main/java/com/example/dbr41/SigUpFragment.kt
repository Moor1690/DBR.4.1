package com.example.dbr41

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dbr41.databinding.FragmentSigUpBinding

class SigUpFragment: Fragment() {
    private lateinit var binding: FragmentSigUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSigUpBinding.inflate(inflater, container, false)
        val btnSigUp = binding.BtnSigUp
        val editLogin = binding.EditLogin
        val editPassword = binding.editPassword
        val editPassword2 = binding.editPassword2
        var m: Mod = Mod()
        m.getInst()
        btnSigUp.setOnClickListener {
            if (editPassword.text.toString() == editPassword2.text.toString()){
                m.sigUp(editLogin.text.toString(),editPassword.text.toString(),context)
            }
        }
        return binding.root
    }
}