package com.example.flagapp.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flagapp.R
import com.example.flagapp.databinding.FragmentMainBinding
import com.example.flagapp.view.adapter.AdapterContinent
import com.example.flagapp.view.data.MockData


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var adapterContinent: AdapterContinent
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        adapterContinent = AdapterContinent()
        binding.rvMain.apply {
            this.adapter = adapterContinent
            this.layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        }

        binding.statusBar.visibility = View.VISIBLE
        binding.statusBar.layoutParams.height =
            resources.getDimensionPixelSize(R.dimen.status_bar_height)
        adapterContinent.updateList(MockData.getContinents())
        binding.btnPlay.setOnClickListener { findNavController().navigate(R.id.action_mainFragment_to_startGameFragment) }
        return binding.root
    }
}