<template>
  <h3>자식이 받았어요.. {{ message }}</h3>
  <h3>자식이 받았어요.. {{ number }}</h3>
  <h3>자식이 받았어요.. {{ obj.name }}</h3>
  <h3>자식이 받았어요.. {{ obj.age }}세</h3>
  <hr>
  <div>
    <ProvideInjectGrandChild />
  </div>
</template>

<script setup>
import { inject, provide } from 'vue'
import ProvideInjectGrandChild from './ProvideInjectGrandChild.vue';

const message = inject('pmess');
const number = inject('pnum');
const obj = inject('pobj');
provide("pnum", number.value + 100);
</script>

<style scoped>
  h3 {
    color : rgb(255, 0, 183)
  }
</style>