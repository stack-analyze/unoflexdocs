package com.stackanlyze.unoflexviews.fragments.counter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    val totalPlayers = MutableLiveData<Int>(0)
    val cards = MutableLiveData<Int>(7)

    val selectPlayers = listOf<Int>(0, 2, 3, 4, 5, 6, 7, 8)
}