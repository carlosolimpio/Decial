<template id="app">
  <div class="card">

    <div class="card-header">
      <ul>
        <div>
          <ul >
            <div>

            </div>
            <div class="card-body" v-on:mousemove="teste" >
              <a href="#" v-for="post in posts">
                <img class="avatar border-gray pull-left" src="static/img/faces/face-3.jpg" alt="...">
                {{ usuario.nome }}<br>

                <h5 id="txtlocalizacao" class="card-title"  > {{ post.solicitacaoDescricao }} </h5><br>

                <h5 id="endereco" class="card-title"  > Rua: {{ post.solicitacaoEndereco }}</h5><br>
                <h5 id="cep" class="card-title"  > Cep: {{ post.cep }}</h5><br>

                <h5 id="descricao" class="card-title" >Bairro: {{ post.solicitacaoBairro }}  </h5><br>

                <h5 id="referencia" class="card-title"  >Ponto de Referência: {{ post.enderecoReferencia }} </h5><br>

                <div>
                  <button id="aceitar"  type="button" class="btn btn-info btn-fill" @click.prevent="aceitarPonto" >Aceitar</button>
                  <button id="rejeitar"  type="button" class="btn btn-secondary btn-fill" @click.prevent="rejeitarPonto">Rejeitar</button>
                </div><br>

              </a>

              <div id="imagens">

              </div>
              <!--<div id="botoes">-->

                <!--<button id="teste"  type="button" class="btn btn-info btn-fill" v-on:click="teste" >teste</button>-->

              <!--</div>-->
              <br>
            </div>
            <br>
          </ul>


        </div>

      </ul>

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
        posts: {},
        errors: []
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
      rejeitarPonto () {
        let id = this.posts.id.toString()
        axios.get('http://localhost:9000/api/pontos_riscod/' + id.toString())
          .then(response => {
            this.posts = response.data
            let r = confirm('Deseja realmente rejeitar este ponto?')
            if (r === true) {
              alert('Ponto rejeitado')
            } else {

            }

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

