const flexColorblind = [
  {
    colorName: "amarillo",
    origin: "uno flex",
    image: "./colorblind/colorbind_yellow1.svg"
  },
  {
    colorName: "azul",
    origin: "uno flex",
    image: "./colorblind/colorbind_blue1.svg"
  },
  {
    colorName: "verde",
    origin: "uno flex",
    image: "./colorblind/colorbind_green1.svg"
  },
  {
    colorName: "rojo",
    origin: "uno flex",
    image: "./colorblind/colorbind_red1.svg"
  },
  {
    colorName: "amarillo",
    origin: "uno version 2024",
    image: "./colorblind/colorbind_yellow2.svg"
  },
  {
    colorName: "azul",
    origin: "uno version 2024",
    image: "./colorblind/colorbind_blue2.svg"
  },
  {
    colorName: "verde",
    origin: "uno version 2024",
    image: "./colorblind/colorbind_green2.svg"
  },
  {
    colorName: "rojo",
    origin: "uno version 2024",
    image: "./colorblind/colorbind_red2.svg"
  },
];


const ColorblindView = defineComponent({
  setup: () => ({ flexColorblind }),
  template: `
    <v-row class="colorblind">
      <v-col
        v-for="items of flexColorblind"
        md="3"
        sm="6"
        cols="12"
      >
         <v-card class="pa-2 ma-2" max-width="400">
            <v-img :src="items.image" height="150"></v-img>

           <v-card-title>{{ items.colorName }}</v-card-title>

           <v-card-subtitle>{{ items.origin }}</v-card-subtitle>
         </v-card>
      </v-col>
    </v-row>
  `
})