const rules = [
  {
    title: "decir uno",
    subtitle: `
        cuando le queda una carta debe decir ¡UNO! para avisar.
        en caso contrario recibes dos cartas como castigo.
        `,
  },
  {
    title: "como ganar",
    subtitle: "la unica forma de ganar es deshacer todas las cartas",
  },
  {
    title: "Carta de Poder",
    subtitle: `
        cada jugador tiene su carta de poder en el lado verde.
        si usas tu carta por el lado flex o cartas con el icono de voltear ocurre lo siguiente caso se cambiar de lado verde a rojo o viceversa.
        cuando todos los jugadores tiene su carta de poder a lado  rojo debe cambiar al lado verde.
        `,
    prependAvatar: "./cards/poder_activo.webp",
    appendAvatar: "./cards/poder_inactivo.webp"
  },
  {
    title: "carta flex",
    subtitle: `
        esta carta dos lados: 
        		lado regular o color principal.
        		lado flex o color especial.
        cuando se juega estas cartas debes voltear su carta de poder.
        el siguiente jugador debe jugar por el lado regular.
        `,
    prependAvatar: "./cards/carta_flex.webp",
  },
  {
    title: "carta cambio de poder",
    subtitle: "cuando se juegar esta carta con el simbolo de voltear por obligacion debes voltear su carta de poder sin importar que color se encuetra.",
    prependAvatar: "./cards/cambio_de_poder.webp",
  },
  {
    title: "toma 2",
    subtitle: "el siguiente jugador toma 2 cartas y pierde su turno",
    prependAvatar: "./cards/toma2.webp",
  },
  {
    title: "salta",
    subtitle: "el siguiente jugador pierde su turno",
    prependAvatar: "./cards/salta.webp",
  },
  {
    title: "reversa",
    subtitle: `
        en esta carta tiene dos condiciones:
        	condición 1: si estas en una partida de ods jugadores actua como una carta salta y te permite otro turno. 
        	condición 2: cambia la dirección del juego si el juego iba hacia la derecha el juego ira hacia la izquierda o viceversa.
        `,
    prependAvatar: "./cards/reversa.webp",
  },
  {
    title: "comodín todos voltean",
    subtitle: `
        todos los juegadores deben voltear su carta de poder.
        debes escoger el color para seguir la partida.
        `,
    prependAvatar: "./cards/comodin_todos_voltean.webp",
  },
  {
    title: "flex toma 2",
    subtitle: `
        lado regular: funciona igual que la carta toma 2.
        lado flex: todos los jugadores tomar una 1 carta "no pierde su turno".
        `,
    prependAvatar: "./cards/flex_toma2.webp",
  },
  {
    title: "flex salta",
    subtitle: `
        lado regular: funciona igual que la carta salta.
        lado flex: salta a todos los jugadores y vuelves a tirar otra carta.
        `,
    prependAvatar: "./cards/flex_salta.webp",
  },
  {
    title: "flex reversa",
    subtitle: `
        lado regular: funciona igual que la carta reversa.
        lado flex: aprarte de cambiar la dirección de juego el siguiente jugador de la nueva dirección pierde su turno.
        `,
    prependAvatar: "./cards/flex_reversa.webp",
  },
  {
    title: "comodín flex toma 2 focalizada",
    subtitle: `
        lado regular: funciona como un comodín multicolor clásico.
        lado flex: eligues a un jugador al azar para tomar 2 cartas y no piede el turno.
        `,
    prependAvatar: "./cards/comodin_flex_focalizada.webp",
  },
  {
    title: "comodín flex todos toman",
    subtitle: `
        lado regular: funciona como un comodín multicolor clásico.
        lado flex: todos los jugadores tomar una 2 cartas "no pierde su turno".
        `,
    prependAvatar: "./cards/comodin_flex_todos_toman.webp",
  },
  {
    title: "comodín flex toma 4",
    subtitle: `
        lado regular: funciona como un comodín toma 4 bajo los siguientes casos:
        	1. si no te desafia toma 4 cartas y pierde el turno.
        	2. sí tu sospecha era cierta el jugador que tiro el comodin toma 4 va tomar las 4 cartas en su lugar.
        	3. sí tu sospecha era falsa en lugar de 4 toma 6 y pierden el turno.
        lado flex: eligues a un jugador al azar para tomar 4 cartas y no piede el turno.
        "como es un comodín eliges el color para continuar con la partida."
        `,
    prependAvatar: "./cards/comodin_flex_toma4.webp",
  }
]

const RulesView = defineComponent({
  setup: () => ({ rules }),
  template: `
        <VList 
          :items="rules"
          item-props
        ></VList>
    `
})