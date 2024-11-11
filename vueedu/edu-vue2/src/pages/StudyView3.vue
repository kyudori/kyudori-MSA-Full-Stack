<template>
  <div class="study">
    <h1>한규현의 Vue 학습 페이지-33</h1>
  </div>
  <hr>
  <Book297/> 
  <hr>
  <Book301></Book301>
  <hr>
  <Book302></Book302>
  <hr>
  <Book304></Book304>
  <hr>
  <Book306></Book306>
  <hr>
  <Book307></Book307>
  <hr>
  <Book311></Book311>
  <hr>
  <Book313></Book313>
  <hr>
  <Book314></Book314>
  <hr>
  <Book315></Book315>
  <hr>
  <Book323 v-if="showComponent"></Book323>
  <button @click="toggleComponent">Unmount Component</button>
  <hr>
  <Book325 :count="count1" :state="state1"></Book325>
  <hr>
  <h1>{{ count }}</h1>
  <h1>{{ state.count }}</h1>
  <Book327
    @count-increment="countIncrement"
    @state-count-increment="(arr) => stateCountInrement(50, arr)" />
  <hr>
  <Book332/>
</template>

<script setup>
import { reactive, ref } from 'vue';
import { computed, provide } from 'vue';
import Book297 from '@/components/book/Book297.vue';
import Book301 from '@/components/book/Book301.vue';
import Book302 from '@/components/book/Book302.vue';
import Book304 from '@/components/book/Book304.vue';
import Book306 from '@/components/book/Book306.vue';
import Book307 from '@/components/book/Book307.vue';
import Book311 from '@/components/book/Book311.vue';
import Book313 from '@/components/book/Book313.vue';
import Book314 from '@/components/book/Book314.vue';
import Book315 from '@/components/book/Book315.vue';
import Book323 from '@/components/book/Book323.vue';
import Book325 from '@/components/book/Book325.vue';
import Book327 from '@/components/book/Book327.vue';
import Book332 from '@/components/book/Book332.vue';
const count = ref(0);
const state = reactive({
  count: 0,
});

const count1 = ref(10);
const state1 = reactive({
  count: 10,
});

const showComponent = ref(true);
const toggleComponent = () => {
  showComponent.value = !showComponent.value;
};


const countIncrement = (num1, num2, num3) => {
  count.value = num1 + num2 + num3;
};
const stateCountInrement = (direct, arr) => {
  state.count = direct + arr[0];
};


const fruits = reactive(['apples', 'bananas', 'oranges']);
const fruitsTxt = computed(() => `I like ${fruits[0]}`);
provide('fruitsArr', fruits);
provide('fruitsText', fruitsTxt);
provide('userObj', { name: '둘리', age: 20 });
</script>
<style>
.study {
  color: blue;
}

.redline {
  height: 3px;
  background-color: brown;
}

hr {
  height : 3px;
  background-color: red;
}

button {
  margin : 5px;
}
</style>
