<template>        
        <div>localv : {{ localv }}</div>
        <div>store1.count: {{ store1.count }}</div>
        <button @click="store1.count++">1 증가(연산식)</button>
        <button @click="store1.increment">1 증가(action 호출)</button>
        <div>store1.count : {{ store1.count }}</div>
        <hr />        
        <div>친구 이름: {{ name }}</div>
        <div>친구 나이 : {{ age }}</div>
        <img :src="store2.logo">
        <button @click="store2.updateAge(5)">친구나이변경</button>
        <button @click="age++">+</button>
        <img :src="store2.logo">
				<div>{{  getDataAll }}</div>
</template>

<script setup>
import { useCounterStore } from '@/stores/counter'
import { useFriendStore } from '@/stores/friendstore'
import { useListStore } from '@/stores/liststore';
import { storeToRefs } from 'pinia'

const store1 = useCounterStore();
let localv = store1.count;

const store2 = useFriendStore()
console.log(store2);
const { name, age } = storeToRefs(store2)

const list = useListStore();
const { getDataAll } = storeToRefs(list);
</script>

<style scoped>
	img {
		width : 50px;
	}
	h3 {
		color :deeppink;
	}
</style>

