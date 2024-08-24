const defaultTheme = matchMedia('(prefers-color-scheme: dark)').matches ? 'dark' : 'light'

const vuetify = createVuetify({
  theme: {
    defaultTheme,
    themes: {
      light: {
        dark: false,
        colors: {
          background: '#f5fafc',
          primary: '#00687a',
          secondary: '#4b6269',
          error: '#ba1a1a',
          info: '#001f26',
          success: '#2dd36f',
          warning: '#ffc409',
        }
      },
      dark: {
        dark: true,
        colors: {
          background: '#0f1416',
          primary: '#85d2e7',
          secondary: '#004e5d',
          error: '#ffb4ab',
          info: '#001f26',
          success: '#2fdf75',
          warning: '#ffd534',
        }
      }
    }
  },
})

const history = createWebHashHistory()

const routes = [
  { path: '/', component: RulesView },
  { path: '/counter', component: CounterView },
  { path: '/colorblind', component: ColorblindView },
]

const router = createRouter({ history, routes })

const app = createApp(App)
app.use(router).use(vuetify).mount('body')
