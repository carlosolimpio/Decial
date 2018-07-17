import Vue from 'vue'
import VueRouter from 'vue-router'
import App from './App.vue'

// LightBootstrap plugin
import LightBootstrap from './light-bootstrap-main'

// router setup
import routes from './routes/routes'
// plugin setup
Vue.use(VueRouter)
Vue.use(LightBootstrap)

// configure router
const router = new VueRouter({
  routes, // short for routes: routes
  linkActiveClass: 'nav-item active'
})

export const serverBus = new Vue(
  {
    data: {
      usuarios: [
        {
            login: 'ramices',
            senha: '1234',
            email: 'ramicesmoises@gmail.com',
            nome: 'Ramices',
            sobrenome: 'Moises',
            endereco: 'Bela Vista',
            cidade: 'Vitoria de Santo Antao',
            pais: 'Brasil',
            CEP: '55500000',
            sobreMim: `Estudante da UFRPE`,
            caminhoFoto: 'static/img/faces/ramices.jpg'
        }]
    }
  }
);


/* eslint-disable no-new */
new Vue({
  el: '#app',
  render: h => h(App),
  router
})
