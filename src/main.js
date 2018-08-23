import Vue from 'vue'
import VueRouter from 'vue-router'
import App from './App.vue'
import axios from 'axios';


// LightBootstrap plugin
import LightBootstrap from './light-bootstrap-main'

// router setup
import routes from './routes/routes'
import { create } from 'domain';
import { createDecipher } from 'crypto';
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
        ],
        logado: false
    }
  }
)

axios.get("http://localhost:9000/api/usuarios",{ responseType: 'json' })
.then(response => {
  serverBus.usuarios = response.data
})

/* eslint-disable no-new */
new Vue({
  el: '#app',
  render: h => h(App),
  router
})