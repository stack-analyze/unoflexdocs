const CounterView = defineComponent({
  components: { Player },
  setup() {
    const playerList = [0, 2, 3, 4, 5, 6, 7, 8]
    const totalPlayers = ref(0)

    return { playerList, totalPlayers }
  },
  template: `
    <VSelect v-model="totalPlayers" :items="playerList"></VSelect>
    <VRow class="players">
      <Player v-for="player in totalPlayers" :player />
    </VRow>
  `
})