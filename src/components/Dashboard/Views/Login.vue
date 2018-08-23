<template>

    <div >
    
        <form class= 'col-lg-4 pagination-centered center-block' style= "background-color: #FFF; margin-left:auto; margin-right:auto; margin-top:auto; margin-bottom:auto;">
            <div class = 'form-group   ' >
                <legend>Login</legend>
                <label>Login:</label> <input class = 'form form-control' type="text" placeholder="Login" v-model='usuario.login'  >
                <label>senha:</label> <input class = 'form form-control'  type="password" placeholder="Senha" v-model ='usuario.senha' >
                <br>
                <button class = 'btn btn-primary ' v-on:click = 'login'>Login</button>
                <br>
                <br>
                <div class = 'alert alert-danger' v-if='errado'>Usuário inválido</div>
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
            errado: false

        }
    },
    methods:
    {
        login()
        {
           
            
            axios.get('http://localhost:9000/api/usuarios/login/' + this.usuario.login + "/" + this.usuario.senha)
            .then(function(response){
                
               
                if(!response.data.login)
                {
                   
                    alert("Usuário inválido")
                }
                else
                {
                    
                    serverBus.logado = true;
                    serverBus.usuario = response.data
                    serverBus.$emit('logged', true);
                    this.$router.go('/admin/maps');
                    
                    
                }
            });  
        }
    }
}
</script>
