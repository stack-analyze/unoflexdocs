package com.stackanlyze.unoflexviews.fragments.colorblind

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.stackanlyze.unoflexviews.adapters.colorblind.ColorblindAdapter
import com.stackanlyze.unoflexviews.databinding.FragmentColorblindBinding
import com.stackanlyze.unoflexviews.scripts.oolorblindList

class ColorblindFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val binding = FragmentColorblindBinding.inflate(inflater, container, false)
        val root = binding.root
        // Inflate the layout for this fragment
        val recyclerView = binding.recycleColorblind
        val grid = GridLayoutManager(context, 2)

        recyclerView.layoutManager = grid
        recyclerView.adapter = ColorblindAdapter(oolorblindList)

        return root
    }
}