<template>
    <h2>watch와 watchEffect 테스트</h2>
    <div>
        <h3>{{ num1 }}</h3>
        <button @click="num1++">increase num1</button>
        <h3>{{ num2 }}</h3>
        <button @click="num2++">increase num2</button>
    </div>
</template>

<script setup>
import { ref, watch, watchEffect } from 'vue';
const num1 = ref(10);
const num2 = ref(100);

// watch : num1 값의 변경이 감지되어야 실행이됨.
watch(num1, (after, previous) => {
    console.log(`[W]현재값 : ${after}`);
    console.log(`[W]이전값 : ${previous}`);
});

watchEffect(() => {
    console.log("num1 이나 num2 가 변경됨!!!");
    console.log(`[WE]num1 : ${num1.value}`);
    console.log(`[WE]num2 : ${num2.value}`);
});        
</script>


