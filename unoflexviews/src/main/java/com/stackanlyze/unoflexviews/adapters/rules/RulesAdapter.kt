package com.stackanlyze.unoflexviews.adapters.rules

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stackanlyze.unoflexviews.scripts.Rule
import com.stackanlyze.unoflexviews.R.layout.list_item

class RulesAdapter(private val ruleList:List<Rule>): RecyclerView.Adapter<RulesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RulesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return RulesViewHolder(layoutInflater.inflate(list_item, parent, false))
    }

    override fun onBindViewHolder(holder: RulesViewHolder, position: Int) {
        val item = ruleList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = ruleList.size
}