
<template>

    <div >
    
        <form class= 'col-lg-4 pagination-centered center-block' style= "background-color: #FFF; margin-left:auto; margin-right:auto; margin-top:auto; margin-bottom:auto;">
            <div class = 'form-group   ' >
                <legend>Cadastro</legend>
                <label>Login:</label> <input class = 'form form-control' type="text" placeholder="Login" v-model='usuario.login'  >
                <label>Senha:</label> <input class = 'form form-control'  type="password" placeholder="Senha" v-model ='usuario.senha' >
                <label>Email:</label> <input class = 'form form-control'  type="text" placeholder="Email" v-model ='usuario.email' >
                <label>Nome:</label> <input class = 'form form-control'  type="text" placeholder="Nome" v-model ='usuario.nome' >
                <label>Sobrenome:</label> <input class = 'form form-control'  type="text" placeholder="Sobrenome" v-model ='usuario.sobreNome' >
                <label>Rua:</label> <input class = 'form form-control'  type="text" placeholder="Rua" v-model ='usuario.rua' >
                <label>Cidade:</label> <input class = 'form form-control'  type="text" placeholder="Cidade" v-model ='usuario.cidade' >
                <label>Pais:</label> <input class = 'form form-control'  type="text" placeholder="Pais" v-model ='usuario.pais' >
                <label>CEP:</label> <input class = 'form form-control'  type="text" placeholder="CEP" v-model ='usuario.cep' >
                <label>TipoUsuario:</label>
                <select class = 'form form-control' v-model = 'usuario.tipo'>
                    <option value = "0">Comum</option>
                    <option value = "1">ADM</option>

                </select>
                <br> 
                <label>Sobre mim:</label> <textarea class = 'form form-control' v-model = 'usuario.sobreMim'></textarea>
                <br>
                <button style ='margin-left: auto; margin-right:auto;' class = 'btn btn-primary ' v-on:click = 'cadastrar'>Cadastrar</button>
                <br>
                <br>
                <div class = 'alert alert-danger' v-if = "erro">{{mensagem}}</div>
                <br>
                <br>
            </div>
            </form>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
        
    </div>

    

</template>

<script>

import axios from 'axios'
import {serverBus} from 'src/main'

export default {
    
    data () {
        return{
            usuario: {},
            mensagem: '',
            erro: false
        }
    },
    methods:
    {
        cadastrar()
        {
           
            if(!this.usuario.login ||this.usuario.login == "")
            {
               this.mensagem = "Digite um usuário";
               this.erro =true;
                return;
            }
            else
                this.erro = false;

            if(!this.usuario.senha ||this.usuario.senha == "")
            {
               this.mensagem = "Digite uma senha";
               this.erro =true;
                return;
            }
            else
                this.erro = false;
                
            if(!this.usuario.email ||this.usuario.email == "")
            {
               this.mensagem = "Digite um email";
               this.erro =true;
                return;
            }
            else
                this.erro = false;

            if(!this.usuario.nome ||this.usuario.nome == "")
            {
               this.mensagem = "Digite um nome";
               this.erro =true;
                return;
            }
            else
                this.erro = false;

            if(!this.usuario.sobreNome ||this.usuario.sobreNome == "")
            {
               this.mensagem = "Digite um sobreNome";
               this.erro =true;
                return;
            }
            else
                this.erro = false;

            if(!this.usuario.rua ||this.usuario.rua == "")
            {
               this.mensagem = "Digite uma rua";
               this.erro =true;
                return;
            }
            else
                this.erro = false;

            if(!this.usuario.cidade ||this.usuario.cidade == "")
            {
               this.mensagem = "Digite uma cidade";
               this.erro =true;
                return;
            }
            else
                this.erro = false;

            if(!this.usuario.pais ||this.usuario.pais == "")
            {
               this.mensagem = "Digite um pais";
               this.erro =true;
                return;
            }
            else
                this.erro = false;

            if(!this.usuario.cep ||this.usuario.cep == "")
            {
               this.mensagem = "Digite um cep";
               this.erro =true;
                return;
            }
            else
                this.erro = false;

             if(!this.usuario.tipo ||this.usuario.tipo == "")
            {
               this.mensagem = "Escolha um tipo de usuario";
               this.erro =true;
                return;
            }
            else
                this.erro = false;

            if(!this.usuario.sobreMim ||this.usuario.sobreMim == "")
            {
               this.mensagem = "Digite algo sobre você";
               this.erro =true;
                return;
            }
            else
                this.erro = false;
            
            this.usuario.caminhoImagem = 'caminhoImagem'
           //alert('http://localhost:9000/api/usuarios/' + this.usuario.login + "/" + this.usuario.senha + "/" + this.usuario.email+ "/" + this.usuario.nome+ "/" + this.usuario.sobreNome+ "/" + this.usuario.rua+ "/" + this.usuario.cidade+ "/" + this.usuario.pais+ "/" + this.usuario.tipo+ "/" + this.usuario.sobreMim+ "/" + this.usuario.caminhoImagem)
           
            axios.get('http://localhost:9000/api/usuarios/' + this.usuario.login + "/" + this.usuario.senha + "/" + this.usuario.email+ "/" + this.usuario.nome+ "/" + this.usuario.sobreNome+ "/" + this.usuario.rua+ "/" + this.usuario.cidade+ "/" + this.usuario.pais+ "/" + this.usuario.cep+ "/" + this.usuario.tipo+ "/" + this.usuario.sobreMim+ "/" + this.usuario.caminhoImagem )
            .then(function(response){
    
              alert("Cadastrado com sucesso");        
               
            });

        }
    }
    
     
}
</script>
