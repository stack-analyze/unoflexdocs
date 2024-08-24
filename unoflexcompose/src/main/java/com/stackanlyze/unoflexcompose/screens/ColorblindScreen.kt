package com.stackanlyze.unoflexcompose.screens

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.stackanlyze.unoflexcompose.components.ColorblindInfo
import com.stackanlyze.unoflexcompose.scripts.colorblindList

@Composable
fun ColorblindScreen() {
    LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 150.dp)) {
        items(colorblindList) {
            ColorblindInfo(
                icon = it.image,
                name = it.colorName,
                origin = it.origin
            )
        }
    }
}