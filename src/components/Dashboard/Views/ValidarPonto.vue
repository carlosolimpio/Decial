<template id="app">
  <div class="card">
    <ul>  
      <div class="card-header">
        <img class="avatar border-gray pull-left" src="static/img/faces/face-3.jpg" alt="...">
          Mike Andrew
        <label id="data">21/03/2018</label>
      </div>
      <div class="card-body">
        <a href="#">
         <h5 id="txtlocalizacao" class="card-title">Area de Risco Rua fulano</h5>
        </a>
        <p class="card-text">Area com risco de desabamento.</p>
        <div id="imagens">
          <img class="avatar border-gray pull-left" src="static/img/faces/face-3.jpg" alt="...">
          <img class="avatar border-gray pull-left" src="static/img/faces/face-3.jpg" alt="...">
        </div>
        <div id="botoes">
          <button id="aceitar"  type="button" class="btn btn-info btn-fill" @click.prevent="aceitarPonto" >Aceitar</button>
          <button id="rejeitar"  type="button" class="btn btn-secondary btn-fill" @click.prevent="rejeitarPonto">Rejeitar</button>
        </div>
      </div>   
    </ul>  
    <ul>
    </ul>  
  </div>
     
  
</template>
<script>
export default {
    methods: {
      aceitarPonto () {
       alert("Ponto aceito");
       aceitar.disabled=true;
       rejeitar.disabled=true;
                   
      },
      rejeitarPonto () {
        alert("Ponto rejeitado"); 
        aceitar.disabled=true;
       rejeitar.disabled=true;
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
