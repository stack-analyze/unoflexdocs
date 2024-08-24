package com.stackanlyze.unoflexviews.fragments.rules

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.stackanlyze.unoflexviews.adapters.rules.RulesAdapter
import com.stackanlyze.unoflexviews.scripts.ruleList
import com.stackanlyze.unoflexviews.databinding.FragmentRulesBinding


class RulesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val binding = FragmentRulesBinding.inflate(inflater, container, false)
        val root = binding.root
        // Inflate the layout for this fragment
        val recyclerView = binding.recycleRules
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = RulesAdapter(ruleList)

        return root
    }
}