<script setup>
import { ref } from 'vue';
const count = ref(0); // 기본 자료형 사용
const state = ref({
  // 참조 자료형 사용
  count: 0,
});
setTimeout(() => {
  count.value++; // count 값 1 증가
}, 5000);
setTimeout(() => {
  state.count++; // state 객체의 count 속성 값 1 증가
}, 5000);
</script>
<template>
  <h3>301p-Composition API 에서의 반응성 데이터 정의 - ref() 함수로 래핑</h3>
  <h1>count : {{ count }}</h1>
  <h1>state : {{ state.count }}</h1>
</template>
