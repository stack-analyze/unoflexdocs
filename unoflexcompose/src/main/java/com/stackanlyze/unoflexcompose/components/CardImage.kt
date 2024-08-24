package com.stackanlyze.unoflexcompose.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CardImage(img: Int) {
    Image(
        painter = painterResource(id = img),
        contentDescription = null,
        modifier = Modifier.size(80.dp)
    )
}