<template>
  <div class="wrapper">
    <side-bar>
      <mobile-menu slot="content"></mobile-menu>
      <sidebar-link to="/admin/maps">
        <i class="nc-icon nc-pin-3"></i>
        <p>Mapa</p>
      </sidebar-link>
      <sidebar-link  to="/admin/user" v-if = "logado">
        <i  class="nc-icon nc-circle-09"></i>
        <p>Perfil</p>
      </sidebar-link>
       <sidebar-link to="/admin/adicionarPontos" v-if = "logado">
        <i class="nc-simple-add"></i>
        <p>Adicionar Pontos</p>
      </sidebar-link>
      <sidebar-link to="/admin/validacao" v-if = "logado">
        <i class="nc-icon nc-check-2"></i>
        <p>Validar Pontos</p>
      </sidebar-link>



    </side-bar>
    <div class="main-panel">
      <top-navbar></top-navbar>

      <dashboard-content @click="toggleSidebar">

      </dashboard-content>

      <content-footer></content-footer>
    </div>
  </div>
</template>
<style lang="scss">

</style>
<script>
  import TopNavbar from './TopNavbar.vue'
  import ContentFooter from './ContentFooter.vue'
  import DashboardContent from './Content.vue'
  import MobileMenu from './MobileMenu.vue'
  import {serverBus} from 'src/main'

  export default {
    components: {
      TopNavbar,
      ContentFooter,
      DashboardContent,
      MobileMenu
    },
    data()
    {
      return{
        logado: serverBus.logado
      }
    },
    created () {
     
      serverBus.$on('logged', (logado) => {
        
        this.logado = logado;
      })
    },  
    
    methods: {
      toggleSidebar () {
        if (this.$sidebar.showSidebar) {
          this.$sidebar.displaySidebar(false)
        }
      }
    }
  }

</script>
