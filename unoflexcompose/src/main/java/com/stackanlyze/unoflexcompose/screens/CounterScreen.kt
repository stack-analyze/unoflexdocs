package com.stackanlyze.unoflexcompose.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.stackanlyze.unoflexcompose.components.Player

@Composable
fun CounterScreen() {
    // static
    val selectPlayers = listOf(0, 2, 3, 4, 5, 6, 7, 8)

    // states
    var totalPlayers by rememberSaveable { mutableIntStateOf(0) }
    var expanded by remember { mutableStateOf(false) }

    // computer
    val dropdownIcon = if (expanded) Icons.Outlined.KeyboardArrowUp else Icons.Outlined.KeyboardArrowDown

    val isManyPlayers = { value: Int -> if (value == 0) "Sin" else value }

    // styles
    val dropdownStyles = Modifier
        .clickable { expanded = true }
        .fillMaxWidth()
        .wrapContentSize(Alignment.TopStart)

    Column {
        Box(modifier = dropdownStyles) {
            ListItem(
                headlineContent = { Text(text = "${isManyPlayers(totalPlayers)} Jugadores") },
                trailingContent = { Icon(dropdownIcon, contentDescription = null) }
            )

            DropdownMenu(
                expanded, onDismissRequest = { expanded = false },
                modifier = Modifier.fillMaxWidth()
            ) {
                selectPlayers.forEach {
                    DropdownMenuItem(
                        text = { Text(text = "${isManyPlayers(it)} Jugadores") },
                        onClick = {
                            expanded = false
                            totalPlayers = it
                        }
                    )
                }
            }
        }

        LazyColumn(state = rememberLazyListState()) {
            items(totalPlayers) { Player(player = it + 1) }
        }
    }
}