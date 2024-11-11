<script setup>
import { inject } from 'vue';
const fruitsArr = inject('fruitsArr', []);
const fruitsText = inject('fruitsText');
const userObj = inject('userObj');
</script>

<template>
  <h3>328p-provide 와 inject : 손자</h3>
  <h1>{{ fruitsArr }}</h1>
  <h1>{{ fruitsText }}</h1>
  <h1>{{ userObj }}</h1>
</template>

<style scoped>
  h1 {
    text-shadow : 2px 2px 3px blue;

  }
</style>
