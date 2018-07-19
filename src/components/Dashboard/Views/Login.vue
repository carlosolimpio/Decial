<template>

    <div>
        <fieldset>
            <legend>Login</legend>
            <label>Login:</label> <input class = 'form form-control' type="text" placeholder="Login" v-model='usuario.login'  >
             <label>senha:</label> <input class = 'form form-control'  type="password" placeholder="Senha" v-model ='usuario.senha' >
             <button class = 'btn btn-primary' v-on:click = 'login'>Login</button>
             <button class = 'btn btn-primary' v-on:click = 'criarConta'>Criar conta</button>
        </fieldset>

    </div>

</template>

<script>
export default {
    
    data () {
        return{
            usuario: {}
        }
    },
    methods:{
        login()
        {
        },
        criarConta()
        {

        }
    }
}
</script>
