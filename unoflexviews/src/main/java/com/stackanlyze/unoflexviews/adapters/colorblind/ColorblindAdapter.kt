package com.stackanlyze.unoflexviews.adapters.colorblind

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stackanlyze.unoflexviews.scripts.Colorblind
import com.stackanlyze.unoflexviews.R.layout.card_info

class ColorblindAdapter(private val colorblindList:List<Colorblind>): RecyclerView.Adapter<ColorblindViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorblindViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return ColorblindViewHolder(layoutInflater.inflate(card_info, parent, false))
    }

    override fun onBindViewHolder(holder: ColorblindViewHolder, position: Int) {
        val item = colorblindList[position]

        holder.render(item)
    }

    override fun getItemCount(): Int = colorblindList.size

}