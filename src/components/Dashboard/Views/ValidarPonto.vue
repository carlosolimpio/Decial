<template id="app">
  <div class="card">

    <div class="card-header">
      <ul id="example-2" v-if="posts && posts.length">
        <div>
          <ul  v-for="post of posts" @change="getPontos()">
            {{ posts }} - {{post.title}} - {{ post.message }}
            <p>{{response}}</p>
            <!--<div>-->
              <!--<img class="avatar border-gray pull-left" src="static/img/faces/face-3.jpg" alt="...">-->
              <!--Mike Andrew-->
              <!--<label id="data">22/03/2018</label>-->
            <!--</div>-->
            <!--<div class="card-body">-->
              <!--<a href="#">-->
                <!--<h5 id="txtlocalizacao" class="card-title">Area de Risco Rua fulano</h5>-->
              <!--</a>-->
              <!--<p class="card-text">Area com risco de desabamento.</p>-->
              <!--<div id="imagens">-->
                <!--<img class="avatar border-gray pull-left" src="static/img/faces/face-3.jpg" alt="...">-->
                <!--<img class="avatar border-gray pull-left" src="static/img/faces/face-3.jpg" alt="...">-->
              <!--</div>-->
              <!--<div id="botoes">-->
                <!--<button id="aceitar"  type="button" class="btn btn-info btn-fill" @click.prevent="aceitarPonto" >Aceitar</button>-->
                <!--<button id="rejeitar"  type="button" class="btn btn-secondary btn-fill" @click.prevent="rejeitarPonto">Rejeitar</button>-->
              <!--</div>-->
              <!--<br>-->
            <!--</div>-->
            <!--<br>-->
          </ul>


        </div>

      </ul>

    </div>

  </div>


</template>
<script>
  import axios from 'axios'
  export default {
    data () {
      return {
        posts: {},
        errors: []
      }
      return {
        el: '#example-2',
        parentMessage: 'Ocorrência',
        items: [
          { message: 'Desabamento de barranco' },
          { message: 'Alagemneto no morro' },
          { message: 'Desabamento de barranco' }
        ],
        newElement: '',
        item: []
      }
    },
    methods: {
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
        alert("Ponto rejeitado")
        aceitar.disabled = true
        rejeitar.disabled = true
      },
      getPontos () {
        axios.get('http://localhost:9000/pontos_risco')
          .then(response => {
            this.posts = response.data
          })
          .catch(e => {
            this.errors.push(e)
          })
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

