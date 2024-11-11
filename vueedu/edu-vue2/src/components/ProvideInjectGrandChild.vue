<template>
  <h4>자손도 받았어요.. {{ message }}</h4>
  <h4>자손도받았어요(부모로 부터).. {{ number }}</h4>
  <h4>자손도 받았어요.. {{ obj.name }}</h4>
  <h4>자손도 받았어요.. {{ obj.age }}세</h4>
  <h4>자손만 받았어요.. {{ message2 }}</h4>
</template>
<script setup>
import { inject } from 'vue'

const message = inject('pmess');
const number = inject('pnum');
const obj = inject('pobj');
const message2 = inject('skipm');
message2.value = message2.value + '- ㅋㅋㅋ';
</script>
<style scoped>
  h4 {
    color : rgb(7, 127, 17)
  }
</style>