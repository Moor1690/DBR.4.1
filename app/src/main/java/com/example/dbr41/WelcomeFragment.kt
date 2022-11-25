package com.example.dbr41

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dbr41.databinding.FragmentSigInBinding

class WelcomeFragment : Fragment() {
    private lateinit var binding: FragmentSigInBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentSigInBinding.inflate(inflater, container, false)

        return binding.root
    }
}