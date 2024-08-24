package com.stackanlyze.unoflexviews.adapters.rules

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.stackanlyze.unoflexviews.scripts.Rule
import com.stackanlyze.unoflexviews.R.id

class RulesViewHolder(view:View): RecyclerView.ViewHolder(view) {
    private val mainCard: ImageView = view.findViewById(id.main_card)
    private val altCard: ImageView = view.findViewById(id.alt_card)
    private val cardTitle: TextView = view.findViewById(id.card_title)
    private val cardDesc: TextView = view.findViewById(id.card_desc)

    fun render(rule: Rule) {
        val firstCard = rule.mainCard ?: 0
        val secondCard = rule.altCard ?: 0

        mainCard.setImageResource(firstCard)
        mainCard.layoutParams.apply {
            val params = if(firstCard != 0) 120 else 0
            height = params
            width = params
        }

        altCard.setImageResource(secondCard)
        altCard.layoutParams.apply {
            val params = if(secondCard != 0) 120 else 0
            height = params
            width = params
        }

        cardTitle.text = rule.title

        cardDesc.text = rule.desc
        //cardDesc.autoSizeMaxTextSize
        //cardDesc.autoSizeStepGranularity
    }
}
