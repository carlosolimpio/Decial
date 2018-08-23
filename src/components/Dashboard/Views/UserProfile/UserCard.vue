<template>
  <card class="card-user">
    <img slot="image" src="https://ununsplash.imgix.net/photo-1431578500526-4d9613015464?fit=crop&fm=jpg&h=300&q=75&w=400" alt="..."/>
    <div class="author">
      <a href="#">
        <img class="avatar border-gray" src="static/img/faces/ramices.jpg" alt="..."/>

        <h4 class="title">{{usuario.nome}}<br />
          <small>{{usuario.login}}</small>
        </h4>
      </a>
    </div>
    <p class="description text-center"> 
      {{usuario.sobreMim}}
    </p>
    <div slot="footer" class="text-center">
      <button href="#" class="btn btn-simple"><i class="fa fa-facebook-square"></i></button>
      <button href="#" class="btn btn-simple"><i class="fa fa-twitter"></i></button>
      <button href="#" class="btn btn-simple"><i class="fa fa-google-plus-square"></i></button>
    </div>
  </card>
</template>
<script>
  import Card from 'src/components/UIComponents/Cards/Card.vue'

 import { serverBus } from 'src/main'

  export default {
    components: {
      Card
    },
    data () {
      return {
        details: [
          {
            title: '12',
            subTitle: 'Files'
          },
          {
            title: '2GB',
            subTitle: 'Used'
          },
          {
            title: '24,6$',
            subTitle: 'Spent'
          }
        ],
        usuario: Object.create(serverBus.usuario)
        
      }
      
    },
     created() {
    serverBus.$on('usuario', (u) => {
    this.usuario = u;
    serverBus.usuarios[0] = u;
    });
    },
    methods: {
      getClasses (index) {
        var remainder = index % 3
        if (remainder === 0) {
          return 'col-md-3 col-md-offset-1'
        } else if (remainder === 2) {
          return 'col-md-4'
        } else {
          return 'col-md-3'
        }
      }
    }
}

</script>
<style>

</style>
