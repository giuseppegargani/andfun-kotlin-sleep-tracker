package com.example.android.trackmysleepquality.Sogni

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android.trackmysleepquality.R
import com.example.android.trackmysleepquality.databinding.FragmentSogniBinding

class SogniFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
    val binding: FragmentSogniBinding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_sogni, container, false)
        return binding.root
    }
}