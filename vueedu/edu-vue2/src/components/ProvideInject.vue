<template>
  <div>
    <h2>provide와 inject(제공자)</h2>
    <ProvideInjectChild />
  </div>
</template>

<script setup>
import ProvideInjectChild from './ProvideInjectChild.vue';
import { provide, ref, reactive } from 'vue'

provide('pmess', '안녕?');
const count = ref(10);
provide('pnum', count);
const obj = reactive({
  name: "한규현",
  age: 20
});
provide('pobj', obj);
provide('skipm', ref('자손에게만 줄 메시지(용돈)'));
</script>