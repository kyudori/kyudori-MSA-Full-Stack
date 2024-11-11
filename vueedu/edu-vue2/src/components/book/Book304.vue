<script setup>
import { reactive } from 'vue';
const state = reactive({
	count:0
});
console.log(state.count); // 0
setTimeout(() => {
  state.count++; // 1초 뒤에 state.count 값 증가
}, 8000);
</script>
<template>
  <h3>304p-reactive() 함수는 객체의 내용 변경을 감지함</h3>
  <h1>state : {{ state.count }}</h1>
</template>
