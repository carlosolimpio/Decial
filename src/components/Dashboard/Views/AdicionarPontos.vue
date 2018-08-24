<template>

  <card>
    <h4 slot="header" class="card-title">Adicionar Pontos</h4>
    <form>
      <div class="row">
        <div class="col-md-5">
          <fg-input type="text"
                    label="Rua"
                    v-model="pontos.solicitacaoEndereco">
          </fg-input>
        </div>
        <div class="col-md-3">
          <fg-input type="text"
                    label="Bairro"
                    v-model="pontos.solicitacaoBairro">
          </fg-input>
        </div>
        <div class="col-md-4">
          <fg-input type="text"
                    label="Ponto de Referência"
                    v-model="pontos.enderecoReferencia">
          </fg-input>
        </div>
      </div>


        <div class="col-md-4">
          <fg-input type="number"
                    label="CEP"
                    v-model="pontos.cep">
          </fg-input>
        </div>
             <div style="padding-left:10px;">
                <form>
                <div class="form-group">
                    <label for="imagens">Adicionar Imagens</label>
                    <input type="file" class="form-control-file" id="imagens">
                </div>
                </form>
            </div>

        <div class="col-md-12" style="padding-top:30px;">
          <div class="form-group">
            <label>Descrição do problema</label>
            <textarea rows="5" class="form-control border-input"
                      placeholder="Descreva a situação"
                      v-model="pontos.solicitacaoDescricao">
              </textarea>
          </div>
      </div>

      <div class="text-center">
        <!--<h3 class = 'text-left alert alert-danger' v-else>Adicionar o ponto</h3><br>-->
        <h3 class = 'text-left alert alert-danger' v-if ='mensagem'>Erro ao adicionar, verifique os campos</h3><br>
        <button   v-on:click = 'postPost' type="submit" class="btn btn-info btn-fill float-center" @click.prevent="updatePonto" >
          Adicionar
        </button>
      </div>

      <div class="clearfix"></div>
    </form>
  </card>
</template>

<script>
  import Card from 'src/components/UIComponents/Cards/Card.vue'
  import axios from 'axios'
  import VueAxios from 'vue-axios'
  import Vue from 'vue'

  Vue.use(VueAxios, axios)

  export default {
    components: {
      Card
    },
    data () {
      return {
        response: [],
        errors: [],
        mensagem: false,
        pontos: {
          cep: '',
          solicitacaoBairro: '',
          solicitacaoEndereco: '',
          solicitacaoDescricao: '',
          enderecoReferencia: ''
          // imagem:''
        }
      }
    },

    methods: {
      updatePonto () {
        if (this.pontos.solicitacaoEndereco !== '' && this.pontos.solicitacaoBairro !== '' && this.pontos.cep !== '' && this.pontos.enderecoReferencia !== '' && this.pontos.solicitacaoDescricao !== '') {
          this.mensagem = false
        } else {
          this.mensagem = true
        }
      },
      postPost () {
        var params = new URLSearchParams()
        params.append('cep', this.pontos.cep)
        params.append('solicitacaoBairro', this.pontos.solicitacaoBairro)
        params.append('solicitacaoEndereco', this.pontos.solicitacaoEndereco)
        params.append('solicitacaoDescricao', this.pontos.solicitacaoDescricao)
        params.append('enderecoReferencia', this.pontos.enderecoReferencia)
        
        axios.get('http://localhost:9000/api/pontos_risco/' + this.pontos.cep + "/" + this.pontos.solicitacaoBairro + "/" + this.pontos.solicitacaoEndereco + "/" + this.pontos.solicitacaoDescricao + "/" + this.pontos.enderecoReferencia )
          .then(function (response) {
            alert("Ponto cadastrado com sucesso")

          })

        // axios.post('http://localhost:9000/pontos_risco/', { crossdomain: true },
        //   {
        //     method: 'POST',
        //     mode: 'cors',
        //     headers: "Access-Control-Allow-Origin"}, this.params
        // )
        //   .then(response => {
        //     this.response = response.data
        //     this.pontos.id = response.data
        //     console.log(response.data)
        //   })
        //   .catch(e => {
        //     this.errors.push(e)
        //     console.log(this.errors)
        //   })
      }
    }
  }

</script>
<style>
</style>



