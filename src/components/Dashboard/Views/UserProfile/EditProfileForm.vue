<template>
  <card>
    <h4 slot="header" class="card-title">Editar perfil</h4>
    <form>
      <div class="row">
        
        <div class="col-md-3">
          <fg-input type="text"
                    label="Login"
                    placeholder="Login"
                    v-model="usuario.login">
          </fg-input>
        </div>
        <div class="col-md-6">
          <fg-input type="email"
                    label="Email"
                    placeholder="Email"
                    v-model="usuario.email">
          </fg-input>
        </div>
      </div>

      <div class="row">
        <div class="col-md-6">
          <fg-input type="text"
                    label="Nome"
                    placeholder="Nome"
                    v-model="usuario.nome">
          </fg-input>
        </div>
        <div class="col-md-6">
          <fg-input type="text"
                    label="Sobrenome"
                    placeholder="Sobrenome"
                    v-model="usuario.sobrenome">
          </fg-input>
        </div>
      </div>

      <div class="row">
        <div class="col-md-12">
          <fg-input type="text"
                    label="Rua"
                    placeholder="Rua"
                    v-model="usuario.rua">
          </fg-input>
        </div>
      </div>

      <div class="row">
        <div class="col-md-4">
          <fg-input type="text"
                    label="Cidade"
                    placeholder="Cidade"
                    v-model="usuario.cidade">
          </fg-input>
        </div>
        <div class="col-md-4">
          <fg-input type="text"
                    label="País"
                    placeholder="País"
                    v-model="usuario.pais">
          </fg-input>
        </div>
        <div class="col-md-4">
          <fg-input type="number"
                    label="CEP"
                    placeholder="CEP"
                    v-model="usuario.CEP">
          </fg-input>
        </div>
      </div>

      <div class="row">
        <div class="col-md-12">
          <div class="form-group">
            <label>Sobre mim</label>
            <textarea rows="5" class="form-control border-input"
                      placeholder="Descreva sobre você"
                      v-model="usuario.sobreMim">
              </textarea>
          </div>
        </div>
      </div>
      <div class="text-left">
          <fg-input type="password"
            label="Digite sua senha para atualizar"
            placeholder=""
            v-model="senha">
          </fg-input>
      </div>
      <div class="text-center">
        <h3 class = 'text-left alert alert-danger' v-if ='mensagem'>Erro senha incorreta</h3><br>
        <button type="submit" class="btn btn-info btn-fill float-center" @click.prevent="updateProfile">
          Atualizar
        </button>
      </div>
      <div class="clearfix"></div>
    </form>
  </card>
</template>
<script>
  import Card from 'src/components/UIComponents/Cards/Card.vue'
  import axios from 'axios';

  import { serverBus } from 'src/main'

  export default {
    components: {
      Card
    },
    data () {
      return {
        usuario: serverBus.usuarios[0],
        senha: '',
        mensagem: false
      }
     
    },
    methods: {
      updateProfile () {
        
        if(this.senha === serverBus.usuarios[0].senha)
        { 
          serverBus.$emit('usuario', this.usuario);
          this.mensagem = false;
        }else
           this.mensagem = true;
      }
    }
  }

</script>
<style>

</style>
