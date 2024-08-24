package com.stackanlyze.unoflexcompose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import com.stackanlyze.unoflexcompose.R.drawable

@Composable
fun Player(player: Int) {
    // states
    var cards by remember { mutableIntStateOf(7) }
    var isActive by remember { mutableStateOf(true) }

    // computers
    val singleOrPluralWord = if(cards == 1) "carta" else "cartas"
    val icon = if(isActive) drawable.ic_check else drawable.ic_cancel
    val colorIcon = if(isActive) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error

    val refreshCards = {
        cards = 7

        if(!isActive) {
            isActive = true
        }
    }

    Column {
        Text(
            text = "Jugador $player: $cards $singleOrPluralWord",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Row(horizontalArrangement = Arrangement.Center) {
            IconButton(
                onClick = { isActive = !isActive },
                enabled = cards != 0,
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = colorIcon
                ),
            ) { Icon(
                painterResource(icon), contentDescription = null
            ) }

            TextButton(
                onClick = { cards-- },
                enabled = cards != 0
            ) { Text(text = "-1", color = MaterialTheme.colorScheme.secondary) }
            TextButton(
                onClick = { cards++ },
                enabled = cards != 0,
            ) { Text(text = "+1", color = MaterialTheme.colorScheme.error) }

            TextButton(
                onClick = { cards += 2 },
                enabled = cards != 0,
            ) { Text(text = "+2", color = MaterialTheme.colorScheme.onErrorContainer) }
            TextButton(
                onClick = { cards += 4 },
                enabled = cards != 0,
            ) { Text(text = "+4", color = MaterialTheme.colorScheme.onErrorContainer) }
            TextButton(
                onClick = { cards += 6 },
                enabled = cards != 0,
            ) { Text(text = "+6", color = MaterialTheme.colorScheme.onErrorContainer) }

            IconButton(
                onClick = refreshCards,
                enabled = cards == 0,
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = MaterialTheme.colorScheme.secondary
                ),
            ) { Icon(Icons.Outlined.Refresh, contentDescription = null) }
        }
    }
}