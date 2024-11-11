<script setup>
//import { defineEmits } from 'vue';
const emit = defineEmits(['count-increment', 'state-count-increment']);
const increment = () => {
  emit('count-increment', 10, 20, 30);
};
</script>
<template>
  <h3>327p-자식에서 부모로 이벤트 발생</h3>
  <button @click="increment">count 증가</button>
  <button @click="emit('state-count-increment', [50])">state.count 증가</button>
</template>
