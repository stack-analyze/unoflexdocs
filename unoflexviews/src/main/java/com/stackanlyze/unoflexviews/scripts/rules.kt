package com.stackanlyze.unoflexviews.scripts

import com.stackanlyze.unoflexviews.R.drawable

data class Rule(
    val title: String,
    val desc: String,
    val mainCard: Int? = null,
    val altCard: Int? = null,
)

val ruleList = listOf(
    Rule(
        title = "decir uno",
        desc = """
        cuando le queda una carta debe decir ¡UNO! para avisar.
        en caso contrario recibes dos cartas como castigo.
        """.trimIndent(),
    ),
    Rule(
        title = "como ganar",
        desc = "la unica forma de ganar es deshacer todas las cartas",
    ),
    Rule(
        title = "Carta de Poder",
        desc = """
		esta carta dos lados: 
		  lado regular o color principal.
		  lado flex o color especial.
		si juegas una carta con el lado flex y voltear su carta de poder. 
        el siguiente jugador debe jugar 
        por el lado regular.
		""".trimIndent().format(),
        mainCard = drawable.poder_activo,
        altCard = drawable.poder_inactivo
    ),
    Rule(
        title = "carta flex",
        desc = """
        esta carta dos lados: 
        	lado regular o color principal.
        	lado flex o color especial.
        cuando se juega una carta.
        el siguiente jugador debe jugar por el lado regular.
        """.trimIndent(),
        mainCard = drawable.carta_flex
    ),
    Rule(
        title = "carta cambio de poder",
        desc = """
        cuando se juegar esta carta.
        por obligación debes voltear su carta de poder.
        """.trimIndent(),
        mainCard = drawable.cambio_de_poder
    ),
    Rule(
        title = "reversa",
        desc = """
        en esta carta tiene dos condiciones:
          condición 1: si estas en una partida de 1 vs 1 
          actua como una carta salta. 
          condición 2: cambia la dirección del juego.
        """.trimIndent(),
        mainCard = drawable.reversa
    ),
    Rule(
        title = "salta",
        desc = "el siguiente jugador pierde su turno",
        mainCard = drawable.salta
    ),
    Rule(
        title = "toma 2",
        desc = "toma 2 cartas y pierde su turno",
        mainCard = drawable.toma2
    ),
    Rule(
        title = "comodín todos voltean",
        desc = """
        todos deben voltear su carta de poder.
        debes escoger el color para seguir la partida.
        """.trimIndent(),
        mainCard = drawable.comodin_flex_todos_toman
    ),
    Rule(
        title = "flex reversa",
        desc = """
        lado regular: funciona igual que la carta reversa.
        lado flex: cambiar la dirección y pierde el turno.
        """.trimIndent(),
        mainCard = drawable.flex_reversa
    ),
    Rule(
        title = "flex salta",
        desc = """
        lado regular: funciona igual que la carta salta.
        lado flex: el resto de jugadores pierde su turno.
        """.trimIndent(),
        mainCard = drawable.flex_salta
    ),
    Rule(
        title = "flex toma 2",
        desc = """
        lado regular: funciona igual que la carta toma 2.
        lado flex: todos los jugadores toman una 1 carta.
        """.trimIndent(),
        mainCard = drawable.flex_toma2
    ),
    Rule(
        title = "comodín flex toma 2 focalizado",
        desc = """
        lado regular: comodín multicolor.
        lado flex: eliges a alguien al azar para 
        toman 2 cartas.
        """.trimIndent(),
        mainCard = drawable.comodin_flex_focalizada
    ),
    Rule(
        title = "comodín flex todos toman",
        desc = """
        lado regular: comodín multicolor.
        lado flex: todos los jugadores toman 2 cartas.
        """.trimIndent(),
        mainCard = drawable.comodin_flex_todos_toman
    ),
    Rule(
        title = "comodín flex toma 4",
        desc = """
        lado regular: funciona como un comodín toma 4:
          1. si no te desafia toma 4 cartas y pierde el turno.
          2. si ganas el desafio el rival toma 4 cartas.
          3. sí pierdes el desafio en vez de 4 toma 6 cartas.
        lado flex: eliges a alguien al azar para 
        toman 4 cartas.
        """.trimIndent(),
        mainCard = drawable.comodin_flex_toma4
    )
)