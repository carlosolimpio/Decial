<template id="app">
  <div class="card">

    <div class="card-header">
        <div>
            <div class="card-body">
              <img class="avatar border-gray pull-left" src="static/img/faces/ramices.jpg" alt="...">
                {{ usuario.nome }}
                <br>
                <br>

              <ul>
               <li v-for = "post in posts" :key="post.id"> 
                  <h5 id="txtlocalizacao" class="card-title"  > {{ post.solicitacaoDescricao }} </h5><br>

                  <h5 id="endereco" class="card-title"  > Rua: {{ post.solicitacaoEndereco }}</h5><br>
                  <h5 id="cep" class="card-title"  > Cep: {{ post.cep }}</h5><br>

                  <h5 id="descricao" class="card-title" >Bairro: {{ post.solicitacaoBairro }}  </h5><br>

                  <h5 id="referencia" class="card-title"  >Ponto de Referência: {{ post.enderecoReferencia }} </h5><br>

                  <button id="aceitar"  type="button" class="btn btn-info btn-fill" v-on:click="aceitarPonto" >Aceitar</button>
                  <button id="rejeitar"  type="button" class="btn btn-secondary btn-fill" v-on:click="rejeitarPonto(post.id)">Rejeitar</button>
                  <br>
                  </li>
              </ul>
              <br>
              <br>
              <button v-on:click="teste" class = 'btn btn-primary'>Testar</button>

              </div>
              <br>
            </div>
            <br>

        </div>

    </div>



</template>
<script>
  import axios from 'axios'
  import { serverBus } from 'src/main'

  export default {
    data () {
      return {
        usuario: serverBus.usuario,
        posts: [],
        errors: [],
      }
      // return {
      //   el: '#example-2'
      //  // parentMessage: 'Ocorrência',
      //   // items: [
      //   //   { message: 'Desabamento de barranco' },
      //   //   { message: 'Alagemneto no morro' },
      //   //   { message: 'Desabamento de barranco' }
      //   // ],
      //   // newElement: '',
      //   // item: []
      // }
    },

    profile () {
      serverBus.$on('usuario', (u) => {
        this.usuario = u
      })
    },
    methods: {
      teste () {
        axios.get("http://localhost:9000/api/pontos_risco")
          .then(response => {
            this.posts = response.data
            
          })

      },
      addElement () {
        /*  console.log(e); */
        var title = this.newElement.trim()
        if (title) {
          this.elements.push({ title: title })
          this.newElement = ''
        }
      },
      removeElement (e, index) {
        e.preventDefault()
        this.elements.splice(index, 1)
      },
      aceitarPonto () {
        alert("Ponto aceito")
        aceitar.disabled = true
        rejeitar.disabled = true
      },
      rejeitarPonto (idObjc) {
        var id = idObjc.toString()
        axios.get('http://localhost:9000/api/pontos_risco/deletar/' + id.toString())
          .then(response => {
            this.posts = this.posts.filter(function(element)
            {
              element.id == id;
            })
            alert("Removido com sucesso");

          })
        aceitar.disabled = true
        rejeitar.disabled = true
      }
    }
  }
</script>
<style>
  #data{
    float: right;
    clear: both;
  }
  #txtlocalizacao{
    font-weight: bold;
  }
  #botoes{
    float: right;
    clear: both;
  }
  #imagens{
    float: left;
    clear: both;
  }
</style>

