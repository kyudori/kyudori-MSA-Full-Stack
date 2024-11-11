
<template>
  <h3>현재 값: {{ counter.count }}</h3>
  <h3>{{ counter.name }}</h3>
	<h3>{{ counter.myInfo }}</h3>
  <img :src="counter.logo">        
</template>

<script setup>
import { useCounterStore } from '@/stores/counter'

const counter = useCounterStore()
counter.increment()
counter.increment()
counter.increment()
</script>

<!--
<template>
  <h3>현재 값: {{ count }}</h3>
  <h3>{{ name }}</h3>
	<h3>{{ myInfo }}</h3>
  <img :src="logo">        
</template>

<script setup>
import { useCounterStore } from '@/stores/counter'
import { storeToRefs } from 'pinia'

const counter = useCounterStore()
const {count, name, myInfo} = storeToRefs(counter);
const {logo, increment} = counter;

increment();
increment();
increment();
</script>
-->

<style scoped>
	img {
		width : 100px;
	}
</style>
