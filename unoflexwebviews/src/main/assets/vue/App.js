const links = [
  {
    path: '/',
    name: 'rules',
    icon: 'mdi-text-box-multiple-outline'
  },
  {
    path: '/counter',
    name: 'contador',
    icon: 'mdi-swap-vertical'
  },
  {
    path: '/colorblind',
    name: 'daltonicos',
    icon: 'mdi-eye-off'
  }
]

const App = defineComponent({
  setup: () => ({links}),
  template: `
    <VApp>
      <VContainer :fluid="true">
        <RouterView></RouterView>
      </VContainer>

      <VBottomNavigation grow color="primary">
        <VBtn 
          v-for="link of links" 
          :value="link.name" 
          :to="link.path"
        >
          <VIcon>{{ link.icon }}</VIcon>
          {{ link.name }}
        </VBtn>
      </VBottomNavigation>
    </VApp>
    `
})