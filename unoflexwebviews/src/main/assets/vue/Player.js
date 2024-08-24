const Player = defineComponent({
  props: {
    player: {
      type: Number,
      required: true
    }
  },
  setup() {
    const cards = ref(7)
    const powerActive = ref(true)

    const singleOrPluralWord = computed(
      () => cards.value === 1 ? 'carta' : 'cartas'
    )

    const powerIcon = computed(
      () => powerActive.value ? 'mdi-check' : 'mdi-close'
    )

    const resetCards = () => {
      cards.value = 7

      if (!powerActive.value) {
        powerActive.value = !powerActive.value
      }
    }

    return {
      cards, powerActive, singleOrPluralWord, powerIcon, resetCards
    }
  },
  template: `
    <VCol cols="12">
      <VCard :disabled="cards === 0">
        <VCardTitle>
          jugador {{player}}: {{cards}} {{singleOrPluralWord}}
        </VCardTitle>
        <VCardActions>
          <VRow>
          <VCol cols="4">
          <VBtn
            variant="plain"
            :icon="powerIcon"
            :color="powerActive ? 'success': 'error'"
            @click="powerActive = !powerActive"
          ></VBtn>
          </VCol>

          <VCol cols="4">
          <VBtn
            variant="plain"
            color="success"
            :disabled="cards === 0"
            @click="cards--"
          >-1</VBtn>
          </VCol>

          <VCol cols="4">
          <VBtn
            variant="plain"
            color="error"
            :disabled="cards === 0"
            @click="cards++"
          >+1</VBtn>
          </VCol>

          <VCol cols="3">
          <VBtn
            variant="plain"
            color="error"
            :disabled="cards === 0"
            @click="cards +=2"
          >+2</VBtn>
          </VCol>

          <VCol cols="3">
          <VBtn
            variant="plain"
            color="error"
            :disabled="cards === 0"
            @click="cards +=4"
          >+4</VBtn>
          </VCol>
        
          <VCol cols="3">
          <VBtn
            variant="plain"
            color="error"
            :disabled="cards === 0"
            @click="cards +=6"
          >+6</VBtn>
          </VCol>
          
          <VCol cols="3">
          <VBtn
            icon="mdi-refresh"
            variant="plain"
            color="secondary"
            :disabled="cards !== 0" 
            @click="resetCards"
          ></VBtn>
          </VCol>
          </VRow>
        </VCardActions>
      </VCard>
    </VCol>
  `
})