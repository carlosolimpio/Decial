<template>
  <div class="mapa">
    <gmap-map id="map" :center="center" :zoom="16">
        <gmap-cluster>
            <gmap-marker :key="i" v-for="(m,i) in markers" :position="m.position" :clickable="true">>
                <gmap-info-window>
                    {{conteudo}}
                </gmap-info-window>
            </gmap-marker>
        </gmap-cluster>
    </gmap-map>
  </div>
</template>

<script>
    import {API_KEY} from './Maps/API_KEY'
    import Vue from 'vue'
    import * as VueGoogleMaps from 'vue2-google-maps'

    Vue.use(VueGoogleMaps, {
        load: {
            key: API_KEY
        }
    })

    export default {
        data () {
            return {
                center: {
                    lat: -8.0176474,
                    lng: -34.9465626
                },
                markers: [{
                    position: {
                        lat: -8.0178119,
                        lng: -34.9462917
                    },
                    infoText: 'Ceagri I'
                }, {
                    position: {
                        lat: -8.0194662,
                        lng: -34.9461096
                    },
                    infoText: 'DePAQ'
                }, {
                    position: {
                        lat: -8.0172883,
                        lng: -34.9522069
                    },
                    infoText: 'CEGOE'
                }, {
                    position: {
                        lat: -8.014866,
                        lng: -34.9508437
                    },
                    infoText: 'Biblioteca Central'
                }, {
                    position: {
                        lat: -8.0135442,
                        lng: -34.9509213
                    },
                    infoText: 'Hospital Veterinário'
                }, {
                    position: {
                        lat: -8.0157,
                        lng: -34.9452596
                    },
                    infoText: 'Lafepe'
                }]
            }
        }
  }
</script>

<style>
  #map {
    min-height: calc(100vh - 123px);
  }
</style>
