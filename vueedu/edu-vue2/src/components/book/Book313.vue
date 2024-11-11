<script setup>
import { ref, watch } from 'vue';
const count = ref(0);
watch(count, (currentValue, prevValue) => {
  console.log(currentValue, prevValue);
});
</script>
<template>
  <h3>313p-watch(감시자) 속성 정의와 활용</h3>
  <h1>ref: {{ count }}</h1>
  <button @click="count++">ref 증가</button>
</template>
