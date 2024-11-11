<script setup>
import { ref, watch } from 'vue';
const state = ref({
  count: 0,
});
watch(
  state,
  (currentValue, prevValue) => {
    console.log(currentValue, prevValue);
  },
  /*{
    deep: false,
  }*/
);
</script>
<template>
  <h3>314p-객체를 ref()로 래핑하면 객체의 내용변화 watch가 감지 못함 </h3>
  <h1>ref: {{ state.count }}</h1>
  <button @click="state.count++">ref 증가</button>
</template>
