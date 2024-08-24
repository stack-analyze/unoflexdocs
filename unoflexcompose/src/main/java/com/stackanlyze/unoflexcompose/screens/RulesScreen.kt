package com.stackanlyze.unoflexcompose.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.stackanlyze.unoflexcompose.scripts.rules

@Composable
fun RulesScreen() {
    LazyColumn(state = rememberLazyListState()) {
        items(rules){
            ListItem(
                headlineContent = { Text(it.name) },
                supportingContent = { Text(it.desc) },
                leadingContent = it.card,
                trailingContent = it.altCard
            )
            HorizontalDivider()
        }
    }
}