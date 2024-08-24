package com.stackanlyze.unoflexviews.adapters.counter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stackanlyze.unoflexviews.R.layout.player_counter

class CounterAdapter(private val totalPlayers: Int): RecyclerView.Adapter<CounterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CounterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return CounterViewHolder(layoutInflater.inflate(player_counter, parent, false))
    }

    override fun onBindViewHolder(holder: CounterViewHolder, position: Int) {
        holder.render(position)
    }

    override fun getItemCount(): Int = totalPlayers
}