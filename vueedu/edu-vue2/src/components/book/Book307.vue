<script setup>
import { computed, reactive, ref } from 'vue';
const refCount = ref(10);
const reactiveCount = reactive({ count: 10 });
// ref() 데이터를 활용할 때는 value 속성 사용
const refDoubleCount = computed(() => refCount.value * 2);
// reactive() 데이터는 value 속성이 필요 없음
const reactiveDoubleCount = computed(() => reactiveCount.count * 2);
// computed() 데이터를 출력할 때는 똑같이 value 사용
console.log("계산된 속성 : " + refDoubleCount.value); // 계산된 속성도 ref 처럼 value 속성 사용
console.log("계산된 속성 : " + reactiveDoubleCount.value);
</script>
<template>
  <h3>307p-계산된(computed) 속성 정의 방법</h3>
  <h1>{{ refDoubleCount }}</h1>
  <h1>{{ reactiveDoubleCount }}</h1>
</template>
