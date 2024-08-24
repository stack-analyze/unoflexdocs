package com.stackanlyze.unoflexviews.adapters.counter

import android.annotation.SuppressLint
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.stackanlyze.unoflexviews.R.id
import com.stackanlyze.unoflexviews.R.drawable
import com.stackanlyze.unoflexviews.R.color

class CounterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val ctx = view.context

    private val cards = MutableLiveData(7)
    private val isActive = MutableLiveData(true)

    private val txt: TextView = view.findViewById(id.player_txt)

    private val changePower: Button = view.findViewById(id.change_power)
    private val btnAddCard: Button = view.findViewById(id.add_card)
    private val btnDraw2: Button = view.findViewById(id.draw_two)
    private val btnDraw4: Button = view.findViewById(id.draw_four)
    private val btnDraw6: Button = view.findViewById(id.draw_six)
    private val btnDiscardCard: Button = view.findViewById(id.discard_card)

    private val btnResetCards: Button = view.findViewById(id.refresh)

    @SuppressLint("SetTextI18n")
    fun render(position: Int) {
        changePower.setOnClickListener {
            isActive.value = !isActive.value!!
        }
        btnAddCard.setOnClickListener { cards.value = cards.value!! + 1 }
        btnDiscardCard.setOnClickListener { cards.value = cards.value!! - 1 }
        btnDraw2.setOnClickListener { cards.value = cards.value!! + 2 }
        btnDraw4.setOnClickListener { cards.value = cards.value!! + 4 }
        btnDraw6.setOnClickListener { cards.value = cards.value!! + 6 }
        btnResetCards.setOnClickListener {
            cards.value = 7

            if(!isActive.value!!) {
                isActive.value = true
            }
        }

        isActive.observeForever {
            val icon = if(it) drawable.ic_check else drawable.ic_cancel
            val color = if(it) color.md_theme_primary else color.md_theme_error

            (changePower as MaterialButton).icon = ContextCompat.getDrawable(ctx, icon)
            changePower.setIconTintResource(color)
        }

        cards.observeForever {
            val singleOrPlural = if (it == 1) "carta" else "cartas"

            changePower.isEnabled = it != 0
            btnDiscardCard.isEnabled = it != 0
            btnAddCard.isEnabled = it != 0
            btnDraw2.isEnabled = it != 0
            btnDraw4.isEnabled = it != 0
            btnDraw6.isEnabled = it != 0
            btnResetCards.isEnabled = it == 0

            txt.text = "jugador ${position + 1}: $it $singleOrPlural"
        }
    }
}