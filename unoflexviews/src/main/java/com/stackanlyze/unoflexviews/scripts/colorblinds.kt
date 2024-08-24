package com.stackanlyze.unoflexviews.scripts

import com.stackanlyze.unoflexviews.R.drawable

data class Colorblind (
    val colorName: String,
    val origin: String,
    val image: Int
)

val oolorblindList = listOf(
    Colorblind(
        colorName = "rojo",
        origin = "uno flex",
        image = drawable.colorbind_red1
    ),
    Colorblind(
        colorName = "verde",
        origin = "uno flex",
        image = drawable.colorbind_green1
    ),
    Colorblind(
        colorName = "amarillo",
        origin = "uno flex",
        image = drawable.colorbind_yellow1
    ),
    Colorblind(
        colorName = "azul",
        origin = "uno flex",
        image = drawable.colorbind_blue1
    ),
    Colorblind(
        colorName = "rojo",
        origin = "uno version 2024",
        image = drawable.colorbind_red2
    ),
    Colorblind(
        colorName = "verde",
        origin = "uno version 2024",
        image = drawable.colorbind_green2
    ),
    Colorblind(
        colorName = "amarillo",
        origin = "uno version 2024",
        image = drawable.colorbind_yellow2
    ),
    Colorblind(
        colorName = "azul",
        origin = "uno version 2024",
        image = drawable.colorbind_blue2
    ),
)