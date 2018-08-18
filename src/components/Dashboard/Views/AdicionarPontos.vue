<template>
  <card>
    <h4 slot="header" class="card-title">Adicionar Pontos</h4>
    <form>
      <div class="row">
        <div class="col-md-5">
          <fg-input type="text"
                    label="Rua"
                    v-model="ponto.rua">
          </fg-input>
        </div>
        <div class="col-md-3">
          <fg-input type="text"
                    label="Bairro"
                    v-model="ponto.bairro">
          </fg-input>
        </div>
        <div class="col-md-4">
          <fg-input type="text"
                    label="Ponto de Referência"
                    v-model="ponto.referencia">
          </fg-input>
        </div>
      </div>


        <div class="col-md-4">
          <fg-input type="number"
                    label="CEP"
                    v-model="ponto.cep">
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
                      v-model="ponto.descricao">
              </textarea>
          </div>
      </div>

      <div class="text-center">
        <!--<h3 class = 'text-left alert alert-danger' v-else>Adicionar o ponto</h3><br>-->
        <h3 class = 'text-left alert alert-danger' v-if ='mensagem'>Erro ao adicionar, verifique os campos</h3><br>
        <button type="submit" class="btn btn-info btn-fill float-center" @click.prevent="updatePonto">
          Adicionar
        </button>
      </div>

      <div class="clearfix"></div>
    </form>
  </card>
</template>
<script>
  import Card from 'src/components/UIComponents/Cards/Card.vue'

  export default {
    components: {
      Card
    },
    data () {
      return {
        ponto: {
          rua: '22 de Outubtro',
          bairro: 'Vasco da Gama',
          referencia: 'treze',
          cep: '52018260',
          descricao: `Barreira com risco de desabamento`,
          imagem:''
        },
        mensagem: false

      }
    },
    methods: {
      updatePonto () {
        if(this.ponto.rua != "" && this.ponto.bairro != "" && this.ponto.cep != "" && this.ponto.referencia != "" && this.ponto.descricao != ""){
          this.mensagem = false;
        }else{
          this.mensagem = true;

        }

      }
    }

  }

</script>
<style>
</style>



