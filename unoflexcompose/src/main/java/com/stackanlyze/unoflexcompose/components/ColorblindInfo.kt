package com.stackanlyze.unoflexcompose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ColorblindInfo(
    icon: Int, name: String, origin: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(10.dp)
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = null,
            modifier = modifier.size(80.dp),
            tint = MaterialTheme.colorScheme.inverseSurface
        )
        Text(name)
        Text(origin)
    }
}