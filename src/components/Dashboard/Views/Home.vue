<template>
    <div class="home">
        <nav class="navbar navbar-expand-lg">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Decial</a>
                <div class="collapse navbar-collapse justify-content-end">
                    <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="#/Cadastro">
                        Cadastro
                        </a>
                        <a class="nav-link" href="#/login">
                        Log in
                        </a>
                    </li>
                    </ul>
                </div>
            </div>
        </nav>
        <maps></maps>
        <content-footer></content-footer>
    </div>
    
</template>

<script>
    import Maps from './Maps.vue'
    import ContentFooter from '../Layout/ContentFooter.vue'

    export default {
        name: 'Home',
        components: {
            Maps,
            ContentFooter
        } 
    }
</script>

<style>
</style>

