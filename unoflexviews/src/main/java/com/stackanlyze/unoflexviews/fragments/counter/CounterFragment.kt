package com.stackanlyze.unoflexviews.fragments.counter

import android.annotation.SuppressLint
import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.stackanlyze.unoflexviews.R
import com.stackanlyze.unoflexviews.adapters.counter.CounterAdapter
import com.stackanlyze.unoflexviews.databinding.FragmentCounterBinding

class CounterFragment : Fragment() {

    private val viewModel: CounterViewModel by viewModels()

    @SuppressLint("SetTextI18n")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding = FragmentCounterBinding.inflate(inflater, container, false)
        val root = binding.root

        val menu = binding.menuButton
        menu.setOnClickListener {
            val popup = PopupMenu(context, it)
            
            viewModel.selectPlayers.forEachIndexed { index, value ->
                val optTitle = if (value == 0) "sin jugadores" else "$value jugadores"

                popup.menu.add(Menu.NONE, index, index, optTitle).setOnMenuItemClickListener {
                    viewModel.totalPlayers.value = value

                    return@setOnMenuItemClickListener true
                }
            }

            popup.menuInflater.inflate(R.menu.players_menu, popup.menu)

            popup.show()
        }

        val recyclerView = binding.recycleCounter
        recyclerView.layoutManager = LinearLayoutManager(context)

        viewModel.totalPlayers.observe(viewLifecycleOwner) {
            recyclerView.adapter = CounterAdapter(it)

            val optTitle = if (it == 0) "sin" else it
            menu.text = "$optTitle Jugadores"
        }

        return root
    }
}