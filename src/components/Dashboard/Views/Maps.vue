<template>
  <div class="mapa">
    <gmap-map id="map" :center="center" :zoom="17" :markers="markers">
      <gmap-marker :position="center"></gmap-marker>
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
                  lat: -8.0176527,
                  lng: -34.9465626
              },
              markers: [
              {
                  position: {
                      lat: 52.098823,
                      lng: -4.549537
                  },
                  infoText: 'Marker 1'
              },
              {
                  position: {
                      lat: 52.111571,
                      lng: -4.570579
                  },
                  infoText: 'Marker 2'
              }
          ]
          }
      }
  }
</script>

<style>
  #map {
    min-height: calc(100vh - 123px);
  }
</style>
