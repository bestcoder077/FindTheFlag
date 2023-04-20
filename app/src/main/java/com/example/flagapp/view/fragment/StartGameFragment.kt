package com.example.flagapp.view.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flagapp.R
import com.example.flagapp.viewmodel.StartGameViewModel

class StartGameFragment : Fragment() {

    companion object {
        fun newInstance() = StartGameFragment()
    }

    private lateinit var viewModel: StartGameViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start_game, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StartGameViewModel::class.java)
        // TODO: Use the ViewModel
    }

}