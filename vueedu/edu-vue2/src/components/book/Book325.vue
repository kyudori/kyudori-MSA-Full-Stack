<script setup>
//import { defineProps } from 'vue';
const props = defineProps({
  count: Number, // 형식 : count 값의 자료형은 Number
  state: [Object, Array], // 형식 : state 값의 자료형은 Object와 Array 중 하나
});
</script>
<template>
  <h3>325p-props를 사용한 데이터 전달(defineProps() 사용)</h3>
  <h1>{{ props.count }}</h1>
  <h1>{{ props.state.count }}</h1>
</template>
