package com.example.nonton_movie9.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nonton_movie9.R

class DetailFragments : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        //inflate layout for this fragment
        return inflater.inflate(R.layout.fragment_detil, container, false)
    }
}