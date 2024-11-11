<template>
  <div>
    <h3>Calculator_s-이벤트처리</h3>
    <div>
      <input type="number" v-model="state.num1" @change="plusNumbers" />
      <span> + </span>
      <input type="number" v-model="state.num2" @change="plusNumbers" />
      <span> = </span>
      <span>{{ state.result }}</span>
    </div>
  </div>
</template>
<script setup>
import { reactive } from 'vue';
let state = reactive({
  num1: 0,
  num2: 0,
  result: 0
});
function plusNumbers() {
  state.result = state.num1 + state.num2;
}
</script>