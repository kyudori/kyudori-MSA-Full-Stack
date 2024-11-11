<script setup>
import { reactive, watch } from 'vue';
const state = reactive({
  count: 0,
});
// 내부 값이 변경되는지 감시할 수 있하지만, currentValue와 prevValue 값이 같음
watch(state, (currentValue, prevValue) => {
  console.log(currentValue, prevValue);
});
</script>
<template>
  <h3>315p-객체를 reactive()로 래핑하면 객체의 내용변화 watch가 감지함</h3>
  <h1>reactive: {{ state.count }}</h1>
  <button @click="state.count++">ref 증가</button>
</template>
