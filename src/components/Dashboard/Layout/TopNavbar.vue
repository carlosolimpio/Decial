<template>
  <nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
      <a class="navbar-brand" href="#"></a>
      <button type="button"
                class="navbar-toggler navbar-toggler-right"
                :class="{toggled: $sidebar.showSidebar}"
                aria-controls="navigation-index"
                aria-expanded="false"
                aria-label="Toggle navigation"
                @click="toggleSidebar">
          <span class="navbar-toggler-bar burger-lines"></span>
          <span class="navbar-toggler-bar burger-lines"></span>
          <span class="navbar-toggler-bar burger-lines"></span>
      </button>
      <div class="collapse navbar-collapse justify-content-end">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link" v-if ="logado" href="#/admin/config">
              Configurações
            </a>
            <a class="nav-link" v-else href="#/admin/login">
              Login
            </a>
            <a v-on:click = 'sair' class="nav-link" href="#/" v-if = "logado">
              Sair
            </a>
            <a class="nav-link" v-else href="#/admin/cadastro">
              Cadastro
            </a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</template>
<script>

import {serverBus} from 'src/main'

  export default {
    name: 'navbar',
    computed: {
      routeName () {
        const {name} = this.$route
        return this.capitalizeFirstLetter(name)
      }
    },
    data () {
      return {
        activeNotifications: false,
        logado: serverBus.logado
      }
    },
    created () {
     
      serverBus.$on('logged', (logado) => {
        this.logado = logado;
        this.$router.push('/admin/user');
        
      })

        serverBus.$on('cadastrado', (logado) => {
        this.$router.push('/admin/login');
        
      })
    },
    methods: {
      capitalizeFirstLetter (string) {
        return string.charAt(0).toUpperCase() + string.slice(1)
      },
      toggleSidebar () {
        this.$sidebar.displaySidebar(!this.$sidebar.showSidebar)
      },
      hideSidebar () {
        this.$sidebar.displaySidebar(false)
      },
      sair()
      {
        serverBus.logado = true;
        serverBus.adm = false
        serverBus.$emit('logged', false);
            
      }
    }
  }

</script>
<style>

</style>
