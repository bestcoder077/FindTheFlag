package com.example.flagapp.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.flagapp.databinding.ItemCardBinding
import com.example.flagapp.view.model.ModelContinent

class AdapterContinent : RecyclerView.Adapter<AdapterContinent.ViewHolder>() {
    private var list = mutableListOf<ModelContinent>()

    inner class ViewHolder(private var binding: ItemCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: ModelContinent) {
            binding.tvGameType.text = data.type
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(list[position])

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount() = list.size

    fun updateList(list: MutableList<ModelContinent>) {
        this.list = list
    }
}