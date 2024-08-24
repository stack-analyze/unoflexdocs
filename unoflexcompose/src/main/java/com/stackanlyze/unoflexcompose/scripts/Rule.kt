package com.stackanlyze.unoflexcompose.scripts

import androidx.compose.runtime.Composable
import com.stackanlyze.unoflexcompose.components.CardImage
import com.stackanlyze.unoflexcompose.R.drawable

data class Rule(
    val name: String,
    val desc: String,
    val card: (@Composable () -> Unit)? = null,
    val altCard: (@Composable () -> Unit)? = null,
)

val rules = listOf(
    Rule(
        name = "decir uno",
        desc = """
		cuando le queda una carta debe decir ¡UNO! para avisar.
		en caso contrario recibes dos cartas como castigo.
		""".trimIndent(),
    ),
    Rule(
        name = "como ganar",
        desc = "la unica forma de ganar es deshacer todas las cartas",
    ),
    Rule(
        name = "Carta de Poder",
        desc = """
		esta carta dos lados: 
			lado regular o color principal.
			lado flex o color especial.
		cuando se juega estas cartas debes voltear su carta de poder.
		el siguiente jugador debe jugar por el lado regular.
		""".trimIndent(),
        card = { CardImage(drawable.poder_activo) },
        altCard = { CardImage(drawable.poder_inactivo) }
    ),
    Rule(
        name = "carta flex",
        desc = """
		esta carta dos lados: 
			lado regular o color principal.
			lado flex o color especial.
		cuando se juega estas cartas debes voltear su carta de poder.
		el siguiente jugador debe jugar por el lado regular.
		""".trimIndent(),
        card = { CardImage(drawable.carta_flex) },
    ),
    Rule(
        name = "carta cambio de poder",
        desc = """
        cuando se juegar esta carta con el simbolo de voltear.
        por obligacion debes voltear su carta de poder sin importar que color se encuetra.
        """.trimIndent(),
        card = { CardImage(drawable.cambio_de_poder) },
    ),
    Rule(
        name = "reversa",
        desc = """
		en esta carta tiene dos condiciones:
			condición 1: si estas en una partida de 2 jugadores actua como una carta salta y te permite otro turno. 
			condición 2: cambia la dirección del juego.
		""".trimIndent(),
        card = { CardImage(drawable.reversa) },
    ),
    Rule(
        name = "salta",
        desc = "el siguiente jugador pierde su turno",
        card = { CardImage(drawable.salta) },
    ),
    Rule(
        name = "toma 2",
        desc = "el siguiente jugador toma 2 cartas y pierde su turno",
        card = { CardImage(drawable.toma2) },
    ),
    Rule(
        name = "comodín todos voltean",
        desc = """
		todos los juegadores deben voltear su carta de poder.
		debes escoger el color para seguir la partida.
		""".trimIndent(),
        card = { CardImage(drawable.comodin_todos_voltean) },
    ),
    Rule(
        name = "flex reversa",
        desc = """
		lado regular: funciona igual que la carta reversa.
		lado flex: aprarte de cambiar la dirección de juego el siguiente jugador de la nueva dirección pierde su turno.
		""".trimIndent(),
        card = { CardImage(drawable.flex_reversa) },
    ),
    Rule(
        name = "flex salta",
        desc = """
		lado regular: funciona igual que la carta salta.
		lado flex: salta a todos los jugadores y vuelves a tirar otra carta.
		""".trimIndent(),
        card = { CardImage(drawable.flex_salta) },
    ),
    Rule(
        name = "flex toma 2",
        desc = """
		lado regular: funciona igual que la carta toma 2.
		lado flex: todos los jugadores tomar una 1 carta "no pierde su turno".
		""".trimIndent(),
        card = { CardImage(drawable.flex_toma2) },
    ),
    Rule(
        name = "comodín flex toma 2 focalizada",
        desc = """
		lado regular: funciona como un comodín multicolor clásico.
		lado flex: eligues a un jugador al azar para tomar 2 cartas y no piede el turno.
		""".trimIndent(),
        card = { CardImage(drawable.comodin_flex_focalizada) },
    ),
    Rule(
        name = "comodín flex todos toman",
        desc = """
		lado regular: funciona como un comodín multicolor clásico.
		lado flex: todos los jugadores tomar una 2 cartas "no pierde su turno".
		""".trimIndent(),
        card = { CardImage(drawable.comodin_flex_todos_toman) },
    ),
    Rule(
        name = "comodín flex toma 4",
        desc = """
		lado regular: funciona como un comodín toma 4 bajo los siguientes casos:
        	1. si no te desafia toma 4 cartas y pierde el turno.
        	2. sí tu sospecha era cierta el jugador que tiro el comodin toma 4 va tomar las 4 cartas en su lugar.
        	3. sí tu sospecha era falsa en lugar de 4 toma 6 y pierden el turno.
        lado flex: eligues a un jugador al azar para tomar 4 cartas y no piede el turno.
        "como es un comodín eliges el color para continuar con la partida."
		""".trimIndent(),
        card = { CardImage(drawable.comodin_flex_toma4) },
    )
)
