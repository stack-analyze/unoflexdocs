package com.stackanlyze.unoflexviews.adapters.colorblind

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.stackanlyze.unoflexviews.R.id
import com.stackanlyze.unoflexviews.scripts.Colorblind

class ColorblindViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val icColorblind: ImageView = view.findViewById(id.ic_colorblind)
    private val colorName: TextView = view.findViewById(id.color_name)
    private val origin: TextView = view.findViewById(id.orgin)

    fun render(colorblind: Colorblind) {
        icColorblind.setImageResource(colorblind.image)
        colorName.text = colorblind.colorName
        origin.text = colorblind.origin
    }
}